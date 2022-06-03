package com.codegym.furama_resort_spring.dto;

public class EducationDegreeDto {

    private Long educationDegreeId;
    private String educationDegreeName;

    private Employee employee;

    public EducationDegreeDto() {
    }

    public EducationDegreeDto(Long educationDegreeId , String educationDegreeName , Employee employee) {
        this.educationDegreeId = educationDegreeId;
        this.educationDegreeName = educationDegreeName;
        this.employee = employee;
    }

    public Long getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Long educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
