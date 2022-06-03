package com.codegym.furama_resort_spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    @OneToOne(mappedBy = "educationDegreeId")
    private Employee employee;
}
