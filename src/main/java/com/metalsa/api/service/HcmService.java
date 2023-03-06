package com.metalsa.api.service;

import com.metalsa.api.model.entity.LaborLevel;
import com.metalsa.api.payload.LaborLevelDTO;

import java.util.Date;
import java.util.List;

public interface HcmService {

    List<LaborLevelDTO> getLaborLevels(Date fechaEjecucion);

}
