package com.metalsa.api.controller;

import com.metalsa.api.service.HcmService;
import com.metalsa.api.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hcm")
public class HcmController {

    @Autowired
    HcmService hcmService;

    @RequestMapping(value = "/getLaborLevels", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getLaborLevels(@RequestParam(value = "effectiveDate", required = false)
                                       @DateTimeFormat(pattern = "dd-MM-yyyy") Date effectiveDate) {

        hcmService.getLaborLevels(effectiveDate);

        return "check it";
    }
}
