package com.codegym.furamaresortspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EducationDegree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long educationDegreeId;
    private String educationDegreeName;

    @OneToMany(mappedBy = "educationDegreeId")
    private List<Employee> employees = new ArrayList<>();
}
