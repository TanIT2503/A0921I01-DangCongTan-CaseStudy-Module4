package com.codegym.furama_resort_spring.dto;


public class DivisionDto {

    private Long divisionId;
    private String divisionName;
    private Employee employee;

    public DivisionDto() {
    }

    public DivisionDto(Long divisionId , String divisionName , Employee employee) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
        this.employee = employee;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
