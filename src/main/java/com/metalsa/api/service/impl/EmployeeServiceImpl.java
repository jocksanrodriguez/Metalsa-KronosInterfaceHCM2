package com.metalsa.api.service.impl;

import com.metalsa.api.model.entity.Employee;
import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.EmployeeResponse;
import com.metalsa.api.repository.EmployeeRepository;
import com.metalsa.api.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapper mapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper mapper) {
        this.employeeRepository = employeeRepository;
        this.mapper = mapper;
    }

    @Override
    public EmployeeResponse getEmployees() {
        EmployeeResponse response = new EmployeeResponse();
        try{

            employeeRepository.findAll().stream().map(employee -> mapToDTO(employee)).collect(Collectors.toList());
            response.setEmployeeList(
                    employeeRepository
                            .findAll()
                            .stream()
                            .map(employee -> mapToDTO(employee))
                            .collect(Collectors.toList())
            );
            return response;
        }catch(Exception e){
            log.error("Error getting all employess from database. See log for further information: "+e.getMessage());
            return null;
        }
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        EmployeeDTO employeeResult = new EmployeeDTO();
        try{
            Employee employee = mapToEntity(employeeDTO);
            employeeResult = mapToDTO(employeeRepository.save(employee));
        }catch(Exception e){
            log.error("An error has ocurred creating a employee record. See log: "+e.getMessage());
        }
        return employeeResult;
    }

    private EmployeeDTO mapToDTO(Employee employee){
        return mapper.map(employee, EmployeeDTO.class);
    }

    private Employee mapToEntity(EmployeeDTO employeeDTO){
        return mapper.map(employeeDTO, Employee.class);
    }
}
