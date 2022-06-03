package com.codegym.furama_resort_spring.dto;


public class PositionDto {

    private Long positionId;
    private String positionName;

    private EmployeeDto employee;

    public PositionDto() {
    }

    public PositionDto(Long positionId , String positionName , EmployeeDto employee) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.employee = employee;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }
}
