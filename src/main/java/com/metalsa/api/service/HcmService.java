package com.metalsa.api.service;


import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.LaborLevelDTO;

import java.util.Date;
import java.util.List;

public interface HcmService {

    List<EmployeeDTO> getEmployees();
    List<LaborLevelDTO> getLaborLevels(Date fechaEjecucion);

}
