package com.metalsa.api.controller;

import com.metalsa.api.payload.LaborLevelResponse;
import com.metalsa.api.service.LaborLevelService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/laborLevel")
public class LaborLevelController {

    private LaborLevelService laborLevelService;

    public LaborLevelController(LaborLevelService laborLevelService) {
        this.laborLevelService = laborLevelService;
    }

    //@Operation(summary = "Get a list of all members")
    //@GetMapping("/getLaborLevels")
    @RequestMapping(value = "/getLaborLevels", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public LaborLevelResponse getLaborLevels (@RequestParam(value = "effectiveDate", required = false)
                                                  @DateTimeFormat(pattern = "dd-MM-yyyy") Date effectiveDate){

        return laborLevelService.getLaborLevels(effectiveDate);
    }


}
