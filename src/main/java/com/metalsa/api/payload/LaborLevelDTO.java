package com.metalsa.api.payload;

import lombok.*;

import javax.persistence.Lob;
import java.sql.Clob;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @Lob
    private Clob xmlRequest;
    @Lob
    private Clob xmlResponse;

}
