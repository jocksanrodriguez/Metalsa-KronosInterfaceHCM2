package com.metalsa.api.dao;

import com.metalsa.api.model.entity.LaborLevel;
import com.metalsa.api.payload.LaborLevelDTO;

import java.util.List;

public interface HcmDAO {
    public List<LaborLevelDTO> getLaborLevels(String sEffectiveDate);
}
