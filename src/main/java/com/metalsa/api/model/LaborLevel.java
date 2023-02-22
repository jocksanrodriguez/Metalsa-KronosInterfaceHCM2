package com.metalsa.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Clob;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "KRONOS")
public class LaborLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
