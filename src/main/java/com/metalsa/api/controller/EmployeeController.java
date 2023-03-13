package com.metalsa.api.controller;

import com.metalsa.api.facade.HcmKronosFacade;
import com.metalsa.api.payload.EmployeeResponse;
import com.metalsa.api.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;
    private HcmKronosFacade hcmKronosFacade;

    public EmployeeController(EmployeeService employeeService, HcmKronosFacade hcmKronosFacade) {
        this.employeeService = employeeService;
        this.hcmKronosFacade = hcmKronosFacade;
    }



    @GetMapping("/getAllEmployees")
    public EmployeeResponse getAllEmployees() {
        return null;
        //return employerService.getAllEmployers();
    }

    @GetMapping("/getAndSaveEmployees")
    public EmployeeResponse getAndSaveEmployees() {

        EmployeeResponse response = new EmployeeResponse();

        response.setEmployeeList(hcmKronosFacade.getAndSaveEmployess());

        return response;
        //return employerService.getAllEmployers();
    }
}
