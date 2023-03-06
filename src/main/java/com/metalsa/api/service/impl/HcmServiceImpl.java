package com.metalsa.api.service.impl;

import com.metalsa.api.dao.HcmDAO;
import com.metalsa.api.model.entity.LaborLevel;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.payload.LaborLevelResponse;
import com.metalsa.api.repository.LaborLevelRepository;
import com.metalsa.api.service.HcmService;
import com.metalsa.api.util.MapperUtil;
import com.metalsa.api.util.StringUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HcmServiceImpl implements HcmService {


    private LaborLevelRepository laborLevelRepository;
    private HcmDAO hcmDAO;

    public HcmServiceImpl(LaborLevelRepository laborLevelRepository, HcmDAO hcmDAO) {
        this.laborLevelRepository = laborLevelRepository;
        this.hcmDAO = hcmDAO;
    }

    @Override
    public List<LaborLevelDTO> getLaborLevels(Date fechaEjecucion) {
        List<LaborLevelDTO> laborLevelsList = new ArrayList<>();

        try {
            laborLevelsList = hcmDAO.getLaborLevels(StringUtil.encodeFechaHcm(fechaEjecucion));


            /*laborLevelResponse.setLaborLevels(laborLevelsList
                    .stream()
                    .map(laborLevel -> MapperUtil.mapToDTO(laborLevel, LaborLevelDTO.class))
                    .collect(Collectors.toList()));*/

            /*if(laborLevels != null && !laborLevels.isEmpty()) {

                for(LaborLevel niveles:laborLevels) {
                    KronosWFC kronos = new KronosWFC();

                    kronos = kronosWfcDAO.addLaborLevel(
                            StringUtil.deleteSpecialsChars(niveles.getDescripcion()),
                            niveles.getTipoNivel(),
                            niveles.getNombreNivel());

                    niveles.setBloque(numeroBloque);
                    niveles.setFechaCreacion(new Date());
                    niveles.setXmlRequest(new javax.sql.rowset.serial.SerialClob(kronos.getXmlRequest().toCharArray()));
                    niveles.setXmlResponse(new javax.sql.rowset.serial.SerialClob(kronos.getXmlResponse().toCharArray()));

                    if(niveles.getTipoNivel().equals(NivelLaborEnum.CCO_PROYECTO.toString())) {
                        niveles.setTipoNivel("CCOSTOS");
                    }

                    laborLevelRepository.save(niveles);
                }
            }*/


        }catch(Exception e){
            e.printStackTrace();
        }
        return laborLevelsList;
    }
}
