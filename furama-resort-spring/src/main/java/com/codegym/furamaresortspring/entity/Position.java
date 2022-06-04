package com.codegym.furamaresortspring.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long positionId;
    private String positionName;

    @OneToMany(mappedBy = "positionId")
    private List<Employee> employees = new ArrayList<>();

    public Position() {
    }

    public Position(Long positionId, String positionName, List<Employee> employees) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
