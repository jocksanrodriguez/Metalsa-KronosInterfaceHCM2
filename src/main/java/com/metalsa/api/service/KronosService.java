package com.metalsa.api.service;

import com.metalsa.api.model.kronos.KronosWFC;
import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.LaborLevelDTO;

import java.util.List;

public interface KronosService {

    List<KronosWFC> addLaborLevel(List<LaborLevelDTO> laborLevels);
    KronosWFC addLaborLevel(LaborLevelDTO laborLevelDTO);

    KronosWFC addEmployee(EmployeeDTO employeeDTO);
}
