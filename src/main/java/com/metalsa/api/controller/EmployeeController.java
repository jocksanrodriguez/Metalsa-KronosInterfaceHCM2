package com.metalsa.api.controller;

import com.metalsa.api.payload.EmployeeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/getAllEmployees")
    public EmployeeResponse getAllEmployees() {
        return null;
        //return employerService.getAllEmployers();
    }
}
