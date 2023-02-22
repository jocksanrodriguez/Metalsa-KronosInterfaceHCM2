package com.metalsa.api.service.impl;

import com.metalsa.api.model.LaborLevel;
import com.metalsa.api.repository.LaborLevelRepository;
import com.metalsa.api.service.HcmService;
import com.metalsa.api.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class HcmServiceImpl implements HcmService {

    @Autowired
    LaborLevelRepository laborLevelRepository;

    /*@Autowired
    HcmDAO hcmDAO;*/

    @Override
    public List<LaborLevel> getLaborLevels(Date fechaEjecucion) {
        List<LaborLevel> laborLevels = new ArrayList<>();
        Long numeroBloque = new Long(0);

        try {
            numeroBloque = 2L;
            //laborLevels = hcmDAO.getLaborLevels(StringUtil.encodeFechaHcm(fechaEjecucion));

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
        return null;
    }
}
