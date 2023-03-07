package com.metalsa.api.service;

import com.metalsa.api.model.entity.LaborLevel;
import com.metalsa.api.model.kronos.KronosWFC;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.payload.LaborLevelResponse;

import java.util.Date;
import java.util.List;

public interface LaborLevelService {

    LaborLevelResponse getLaborLevels(Date effectiveDate);
    LaborLevelDTO processLaborLevel(KronosWFC kronosWFC);
    LaborLevelDTO createLaborLevel(LaborLevelDTO laborLevelDTO);

}
