package com.metalsa.api.facade.impl;

import com.metalsa.api.facade.HcmKronosFacade;
import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.service.EmployeeService;
import com.metalsa.api.service.HcmService;
import com.metalsa.api.service.KronosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class HcmKronosFacadeImpl implements HcmKronosFacade {

    private HcmService hcmService;

    private KronosService kronosService;

    private EmployeeService employeeService;

    public HcmKronosFacadeImpl(HcmService hcmService, KronosService kronosService, EmployeeService employeeService) {
        this.hcmService = hcmService;
        this.kronosService = kronosService;
        this.employeeService = employeeService;
    }

    @Override
    public List<EmployeeDTO> getAndSaveEmployess() {
        List<EmployeeDTO> allEmployees = new ArrayList<>();
        try{

            log.info("Getting employees from HCM...");
            List<EmployeeDTO> employeesHcm = hcmService.getEmployees();

            log.info("Processing and saving employee");
            for(EmployeeDTO employee: employeesHcm){

                EmployeeDTO savedEmp = employeeService.createEmployee(employee);
                allEmployees.add(savedEmp);

            }
            return allEmployees;
        }catch(Exception e){
            e.printStackTrace();
            log.error("An error has ocurred getting and saving employees from hcm"+e.getMessage());
            return null;
        }

    }
}
