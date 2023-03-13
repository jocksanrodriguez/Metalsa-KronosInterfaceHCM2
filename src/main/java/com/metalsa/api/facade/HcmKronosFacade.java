package com.metalsa.api.facade;

import com.metalsa.api.payload.EmployeeDTO;

import java.util.List;

public interface HcmKronosFacade {

    List<EmployeeDTO> getAndSaveEmployess();
}
