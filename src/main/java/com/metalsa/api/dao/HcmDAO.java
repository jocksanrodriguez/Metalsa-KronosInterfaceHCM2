package com.metalsa.api.dao;

import com.metalsa.api.model.LaborLevel;

import java.util.Date;
import java.util.List;

public interface HcmDAO {
    public List<LaborLevel> getLaborLevels(String sEffectiveDate);
}
