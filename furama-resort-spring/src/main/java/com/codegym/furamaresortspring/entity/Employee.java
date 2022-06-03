package com.codegym.furamaresortspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    private Date employeeBirthday;
    private long employeeIdentifyCard;
    private double employeeSalary;
    private String employeeNumberPhone;
    private String employeeEmail;
    private String employeeAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "positionId", referencedColumnName = "positionId")
    private Position positionId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "educationDegreeId", referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegreeId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "divisionId", referencedColumnName = "divisionId")
    private Division divisionId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userName", referencedColumnName = "userName")
    private User userName;

    @OneToMany(mappedBy = "employeeId")
    List<Contract> contractList = new ArrayList<>();
}
