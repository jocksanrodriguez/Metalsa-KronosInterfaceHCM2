package com.metalsa.api.payload;

import lombok.*;

import java.sql.Clob;
import java.util.Date;

@Getter
@Setter
public class LaborLevelDTO {

    private Long id;
    private Date creationDate;
    private Long sectorNumber;
    private Integer reqCode;
    private String levelName;
    private String description;
    private String levelType;
    private Date creationDateLevel;
    private Date modificationDateLevel;
    private Clob xmlRequest;
    private Clob xmlResponse;

}
