package com.metalsa.api.service;

import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.EmployeeResponse;

public interface EmployeeService {

    EmployeeResponse getEmployees();

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

}
