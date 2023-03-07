package com.metalsa.api.service.impl;

import com.metalsa.api.dao.HcmDAO;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.repository.LaborLevelRepository;
import com.metalsa.api.service.HcmService;
import com.metalsa.api.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
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

        }catch(Exception e){
            log.error("An error has occurred trying to get LaborLevels from HCM "+e.getMessage());
        }
        return laborLevelsList;
    }
}
