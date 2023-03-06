package com.metalsa.api.payload;

import com.metalsa.api.model.entity.LaborLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LaborLevelResponse {

    private List<LaborLevelDTO> laborLevels;

}
