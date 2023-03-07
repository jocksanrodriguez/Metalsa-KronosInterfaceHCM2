package com.metalsa.api.payload;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaborLevelResponse implements Serializable {

    private List<LaborLevelDTO> laborLevels;

}
