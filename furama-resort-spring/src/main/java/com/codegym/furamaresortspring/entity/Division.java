package com.codegym.furamaresortspring.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long divisionId;
    private String divisionName;

    @OneToMany(mappedBy = "divisionId")
    private List<Employee> employees = new ArrayList<>();

    public Division() {
    }

    public Division(Long divisionId, String divisionName, List<Employee> employees) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
