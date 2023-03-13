package com.metalsa.api.payload;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeResponse {

    private List<EmployeeDTO> employeeList;
}
