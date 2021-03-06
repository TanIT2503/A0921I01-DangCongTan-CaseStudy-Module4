package com.codegym.furamaresortspring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationDegreeId;
    private String educationDegreeName;

    @OneToMany(mappedBy = "educationDegreeId")
    private List<Employee> employees = new ArrayList<>();

    public EducationDegree() {
    }

    public EducationDegree(Long educationDegreeId, String educationDegreeName, List<Employee> employees) {
        this.educationDegreeId = educationDegreeId;
        this.educationDegreeName = educationDegreeName;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
