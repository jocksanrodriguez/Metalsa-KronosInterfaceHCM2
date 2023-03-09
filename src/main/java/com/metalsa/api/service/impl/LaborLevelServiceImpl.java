package com.metalsa.api.service.impl;

import com.metalsa.api.dao.StoredHelperDAO;
import com.metalsa.api.model.entity.LaborLevel;
import com.metalsa.api.model.kronos.KronosWFC;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.payload.LaborLevelResponse;
import com.metalsa.api.repository.LaborLevelRepository;
import com.metalsa.api.service.HcmService;
import com.metalsa.api.service.KronosService;
import com.metalsa.api.service.LaborLevelService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class LaborLevelServiceImpl implements LaborLevelService {

    private HcmService hcmService;
    private KronosService kronosService;
    private LaborLevelRepository laborLevelRepository;
    private ModelMapper mapper;
    private StoredHelperDAO storedHelperDAO;

    public LaborLevelServiceImpl(HcmService hcmService, KronosService kronosService,
                                 LaborLevelRepository laborLevelRepository, ModelMapper mapper,
                                 StoredHelperDAO storedHelperDAO) {
        this.hcmService = hcmService;
        this.kronosService = kronosService;
        this.laborLevelRepository = laborLevelRepository;
        this.mapper = mapper;
        this.storedHelperDAO = storedHelperDAO;
    }

    @Override
    public LaborLevelResponse getLaborLevels(Date effectiveDate) {
        List<LaborLevelDTO> laborLevelDTOList = new ArrayList<>();
        LaborLevelResponse laborLevelResponse = new LaborLevelResponse();

        try{
            log.info("Getting data from HCM...");
            List<LaborLevelDTO> laborsFromHcm = hcmService.getLaborLevels(effectiveDate);

            log.info("Getting sector number...");
            Long sectorNumber = storedHelperDAO.getNextSectorNumber();
            if(laborsFromHcm != null && !laborsFromHcm.isEmpty()){

                log.info("Iterating laborList from HCM...");
                for(LaborLevelDTO level:laborsFromHcm){
                    KronosWFC kronosWFC = new KronosWFC();
                    LaborLevelDTO mergedLabor = new LaborLevelDTO();
                    log.info("Sending data to Kronos...");
                    kronosWFC = kronosService.addLaborLevel(level);
                    mergedLabor = mergeLaborLevel(kronosWFC, level);

                    log.info("Setting block number and prepare to send data to database...");
                    mergedLabor.setSectorNumber(sectorNumber);
                    LaborLevelDTO newLaborLevel = createLaborLevel(mergedLabor);

                    log.info("nulling xmlRequest and xmlResponse fields to avoid serialization error");
                    newLaborLevel.setXmlRequest(null);
                    newLaborLevel.setXmlResponse(null);

                    laborLevelDTOList.add(newLaborLevel);
                }
            }


            laborLevelResponse.setLaborLevels(laborLevelDTOList);
        }catch (Exception e){
            log.error("An error has ocurred trying to process getLaborLevels: "+e.getMessage());
            e.printStackTrace();
        }
        return laborLevelResponse;
    }

    @Override
    public LaborLevelDTO mergeLaborLevel(KronosWFC kronosWFC, LaborLevelDTO laborLevelDTO){
        LaborLevelDTO laborMerged = new LaborLevelDTO();

        try{
            laborMerged.setCreationDate(new Date());
            laborMerged.setDescription(laborLevelDTO.getDescription());
            laborMerged.setLevelName(laborLevelDTO.getLevelName());
            laborMerged.setLevelType(laborLevelDTO.getLevelType());
            laborMerged.setModificationDateLevel(laborLevelDTO.getModificationDateLevel());
            laborMerged.setReqCode(laborLevelDTO.getReqCode());
            laborMerged.setXmlRequest(new javax.sql.rowset.serial.SerialClob(kronosWFC.getXmlRequest().toCharArray()));
            laborMerged.setXmlResponse(new javax.sql.rowset.serial.SerialClob(kronosWFC.getXmlResponse().toCharArray()));

        }catch(Exception e){
            log.error("An error has occurred processing labors levels: "+e.getMessage());
            e.printStackTrace();
            return null;
        }

        return laborMerged;
    }

    @Override
    public LaborLevelDTO processLaborLevel(KronosWFC kronosWFC){
        LaborLevelDTO laborLevelDTO = new LaborLevelDTO();

        try{
            laborLevelDTO.setSectorNumber(1L);
            laborLevelDTO.setCreationDate(new Date());
            laborLevelDTO.setXmlRequest(new javax.sql.rowset.serial.SerialClob(kronosWFC.getXmlRequest().toCharArray()));
            laborLevelDTO.setXmlResponse(new javax.sql.rowset.serial.SerialClob(kronosWFC.getXmlResponse().toCharArray()));

        }catch(Exception e){
            log.error("An error has occurred processing labors levels: "+e.getMessage());
            e.printStackTrace();
            return null;
        }


        return laborLevelDTO;
    }

    @Override
    public LaborLevelDTO createLaborLevel(LaborLevelDTO laborLevelDTO){
        LaborLevel laborLevel = new LaborLevel();
        LaborLevel newLabor = new LaborLevel();

        try{
            //laborLevel = MapperUtil.mapToEntity(laborLevelDTO, LaborLevel.class);
            laborLevel = mapToEntity(laborLevelDTO);
            newLabor = laborLevelRepository.save(laborLevel);

        }catch(Exception e){
            log.error("An error has ocurred creating Labor Level on DB: "+e.getMessage());
            e.printStackTrace();
        }
        return mapToDTO(newLabor);
    }

    private LaborLevelDTO mapToDTO(LaborLevel laborLevel){
        return mapper.map(laborLevel, LaborLevelDTO.class);
    }

    private LaborLevel mapToEntity(LaborLevelDTO laborLevelDTO){
        return mapper.map(laborLevelDTO, LaborLevel.class);
    }
}
