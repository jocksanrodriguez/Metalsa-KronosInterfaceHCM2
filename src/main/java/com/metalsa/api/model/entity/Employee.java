package com.metalsa.api.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "KRONOS")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "DATE DEFAULT SYSDATE")
    private Date creationDate;

    @Column(columnDefinition = "INTEGER DEFAULT 0")
    private int employeeStatus;

    @Column(columnDefinition = "INTEGER")
    private int reqCode;

    @Column(columnDefinition = "INTEGER")
    private int personType;

    @Column(columnDefinition = "NUMBER")
    private Long personNum;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(columnDefinition = "DATE")
    private Date hireDate;

    @Column(length = 20)
    private String timezone;

    @Column(length = 100)
    private String location;

    @Column(length = 30)
    private String homeLabor1;

    @Column(length = 30)
    private String homeLabor2;

    @Column(length = 30)
    private String homeLabor3;

    @Column(length = 30)
    private String homeLabor4;

    @Column(length = 30)
    private String homeLabor5;

    @Column(length = 30)
    private String homeLabor6;

    @Column(length = 30)
    private String homeLabor7;

    @Column(length = 30)
    private String linkedCostCenter;

    @Column(length = 20)
    private String groupSched;

    @Column(length = 20)
    private String badgeNum;

    @Column(columnDefinition = "DATE")
    private Date statusDate;

    @Column(length = 30)
    private String username;

    @Column(length = 30)
    private String password;

    @Column(length = 50)
    private String employeeType;

    @Column(length = 50)
    private String assignmentCat;

    @Column(length = 20)
    private String supervisorNumber;

    @Column(length = 10)
    private String company;

    @Column(length = 50)
    private String ebsEmployeeId;

    @Column(length = 50)
    private String emailAddress;

    @Column(length = 50)
    private String socialSecurityId;

    @Column(length = 30)
    private String phoneHome;

    @Column(length = 30)
    private String phoneCell;

    @Column(columnDefinition = "DATE DEFAULT SYSDATE")
    private Date modificationDate;

}
