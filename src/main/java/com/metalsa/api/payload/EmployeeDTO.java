package com.metalsa.api.payload;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeeDTO {

    private Date creationDate;
    private int employeeStatus;
    private int reqCode;
    private int personType;
    private Long personNum;
    private String firstName;
    private String lastName;
    private Date hireDate;
    private String timezone;
    private String location;
    private String homeLabor1;
    private String homeLabor2;
    private String homeLabor3;
    private String homeLabor4;
    private String homeLabor5;
    private String homeLabor6;
    private String homeLabor7;
    private String linkedCostCenter;
    private String groupSched;
    private String badgeNum;
    private Date statusDate;
    private String username;
    private String password;
    private String employeeType;
    private String assignmentCat;
    private String supervisorNumber;
    private String company;
    private String phoneCell;
    private String ebsEmployeeId;
    private String emailAddress;
    private String socialSecurityId;
    private String phoneHome;
    private Date modificationDate;

}
