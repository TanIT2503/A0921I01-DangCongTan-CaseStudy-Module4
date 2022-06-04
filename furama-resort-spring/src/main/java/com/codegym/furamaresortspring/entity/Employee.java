package com.codegym.furamaresortspring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private String employeeIdentifyCard;
    private double employeeSalary;
    private String employeeNumberPhone;
    private String employeeEmail;
    private String employeeAddress;

    @ManyToOne(targetEntity = Position.class)
    private Position positionId;

    @ManyToOne(targetEntity = EducationDegree.class)
    private EducationDegree educationDegreeId;

    @ManyToOne(targetEntity = Division.class)
    private Division divisionId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userName", referencedColumnName = "userName")
    private User userName;

    @OneToMany(mappedBy = "employeeId")
    @JsonBackReference
    List<Contract> contractList = new ArrayList<>();
}
