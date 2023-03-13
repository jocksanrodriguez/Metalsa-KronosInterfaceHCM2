package com.metalsa.api.service.impl;

import com.metalsa.api.dao.KronosDAO;
import com.metalsa.api.model.kronos.KronosWFC;
import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.service.KronosService;
import com.metalsa.api.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class KronosServiceImpl implements KronosService {

    private KronosDAO kronosDAO;

    public KronosServiceImpl(KronosDAO kronosDAO) {
        this.kronosDAO = kronosDAO;
    }

    @Override
    public List<KronosWFC> addLaborLevel(List<LaborLevelDTO> laborLevels) {
        List<KronosWFC> laborsAdded = new ArrayList<>();
        try{

            if(laborLevels != null && !laborLevels.isEmpty()) {

                for(LaborLevelDTO levels:laborLevels) {
                    KronosWFC kronos = new KronosWFC();

                    kronos = kronosDAO.addLaborLevel(
                            StringUtil.deleteSpecialsChars(levels.getDescription()),
                            levels.getLevelType(),
                            levels.getLevelName());
                    laborsAdded.add(kronos);
                }
            }
        }catch(Exception e){
            log.error("An error has occurred trying to add labor levels on Kronos App "+e.getMessage());

        }
        return laborsAdded;
    }

    public KronosWFC addLaborLevel(LaborLevelDTO laborLevelDTO){
        KronosWFC kronos = new KronosWFC();
        try{
            kronos = kronosDAO.addLaborLevel(
                    StringUtil.deleteSpecialsChars(laborLevelDTO.getDescription()),
                    laborLevelDTO.getLevelType(),
                    laborLevelDTO.getLevelName());

        }catch(Exception e){
            log.error("An error has occurred to add Labor Level on Kronos App "+e.getMessage());
            return null;
        }
        return kronos;
    }

    public KronosWFC addEmployee(EmployeeDTO employeeDTO){
        return null;
    }
}
