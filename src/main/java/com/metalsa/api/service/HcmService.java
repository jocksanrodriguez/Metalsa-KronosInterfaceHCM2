package com.metalsa.api.service;

import com.metalsa.api.model.LaborLevel;

import java.util.Date;
import java.util.List;

public interface HcmService {

    List<LaborLevel> getLaborLevels(Date fechaEjecucion);

}
