package com.codegym.furama_resort_spring.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDto {

    private String employeeId;
    private String employeeName;
    private Date employeeBirthday;
    private long employeeIdentifyCard;
    private double employeeSalary;
    private String employeeNumberPhone;
    private String employeeEmail;
    private String employeeAddress;

    private PositionDto positionId;

    private EducationDegreeDto educationDegreeId;


    private DivisionDto divisionId;


    private User userName;


    List<ContractDto> contractDtoList = new ArrayList<>();

    public EmployeeDto(String employeeId , String employeeName , Date employeeBirthday , long employeeIdentifyCard , double employeeSalary , String employeeNumberPhone , String employeeEmail , String employeeAddress , PositionDto positionId , EducationDegreeDto educationDegreeId , DivisionDto divisionId , User userName , List<ContractDto> contractDtoList) {
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
        this.contractDtoList = contractDtoList;
    }

    public EmployeeDto() {
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

    public long getEmployeeIdentifyCard() {
        return employeeIdentifyCard;
    }

    public void setEmployeeIdentifyCard(long employeeIdentifyCard) {
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

    public PositionDto getPositionId() {
        return positionId;
    }

    public void setPositionId(PositionDto positionId) {
        this.positionId = positionId;
    }

    public EducationDegreeDto getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegreeDto educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public DivisionDto getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(DivisionDto divisionId) {
        this.divisionId = divisionId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public List<ContractDto> getContractDtoList() {
        return contractDtoList;
    }

    public void setContractDtoList(List<ContractDto> contractDtoList) {
        this.contractDtoList = contractDtoList;
    }
}
