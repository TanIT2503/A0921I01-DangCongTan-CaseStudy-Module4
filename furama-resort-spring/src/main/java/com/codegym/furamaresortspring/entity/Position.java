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
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long positionId;
    private String positionName;

    @OneToMany(mappedBy = "positionId")
    private List<Employee> employees = new ArrayList<>();
}
