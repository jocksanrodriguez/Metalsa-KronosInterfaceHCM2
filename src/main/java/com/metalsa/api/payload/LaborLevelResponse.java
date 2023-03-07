package com.metalsa.api.payload;

import lombok.*;

import java.util.List;

@Getter
@Setter
public class LaborLevelResponse {

    private List<LaborLevelDTO> laborLevels;

}
