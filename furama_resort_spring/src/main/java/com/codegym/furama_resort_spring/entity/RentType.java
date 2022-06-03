package com.codegym.furama_resort_spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentTypeId;
    private String rentTypeName;

    @OneToMany(mappedBy = "rentTypeId")
    @JsonBackReference
    List<ResortServices> resortServices = new ArrayList<>();
}
