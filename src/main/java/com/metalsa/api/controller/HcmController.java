package com.metalsa.api.controller;

import com.metalsa.api.payload.EmployeeDTO;
import com.metalsa.api.payload.LaborLevelDTO;
import com.metalsa.api.service.HcmService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/hcm")
public class HcmController {

    private final HcmService hcmService;

    public HcmController(HcmService hcmService) {
        this.hcmService = hcmService;
    }

    @GetMapping("/getEmployees")
    public ResponseEntity<List<EmployeeDTO>> getEmployees(){
        return new ResponseEntity<>(hcmService.getEmployees(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getLaborLevels", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LaborLevelDTO>> getLaborLevels(@RequestParam(value = "effectiveDate", required = false)
                                       @DateTimeFormat(pattern = "dd-MM-yyyy") Date effectiveDate) {

        return new ResponseEntity<>(hcmService.getLaborLevels(effectiveDate), HttpStatus.OK);
    }
}
