package com.codegym.furamaresortspring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
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

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, Date employeeBirthday, String employeeIdentifyCard,
            double employeeSalary, String employeeNumberPhone, String employeeEmail, String employeeAddress,
            Position positionId, EducationDegree educationDegreeId, Division divisionId, User userName,
            List<Contract> contractList) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdentifyCard = employeeIdentifyCard;
        this.employeeSalary = employeeSalary;
        this.employeeNumberPhone = employeeNumberPhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.divisionId = divisionId;
        this.userName = userName;
        this.contractList = contractList;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdentifyCard() {
        return employeeIdentifyCard;
    }

    public void setEmployeeIdentifyCard(String employeeIdentifyCard) {
        this.employeeIdentifyCard = employeeIdentifyCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeNumberPhone() {
        return employeeNumberPhone;
    }

    public void setEmployeeNumberPhone(String employeeNumberPhone) {
        this.employeeNumberPhone = employeeNumberPhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegree educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
    
}
