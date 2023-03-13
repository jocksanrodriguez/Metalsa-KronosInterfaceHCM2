package com.metalsa.api.model.entity;

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
    private Integer id;

    @Column(columnDefinition = "DATE")
    private Date creationDate;

    @Column(columnDefinition = "NUMBER DEFAULT 0")
    private Long sectorNumber;

    @Column(columnDefinition = "INTEGER DEFAULT 0")
    private Integer reqCode;

    @Column(length = 20)
    private String levelName;

    @Column(length = 100)
    private String description;

    @Column(length = 50)
    private String levelType;

    @Column(columnDefinition = "DATE DEFAULT SYSDATE")
    private Date creationDateLevel;

    @Column(columnDefinition = "DATE")
    private Date modificationDateLevel;

    private Clob xmlRequest;

    private Clob xmlResponse;

    @Column(length = 20)
    private String linkedCostCenter;
}
