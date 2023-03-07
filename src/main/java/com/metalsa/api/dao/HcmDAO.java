package com.metalsa.api.dao;

import com.metalsa.api.payload.LaborLevelDTO;

import java.util.List;

public interface HcmDAO {
    List<LaborLevelDTO> getLaborLevels(String sEffectiveDate);
}
