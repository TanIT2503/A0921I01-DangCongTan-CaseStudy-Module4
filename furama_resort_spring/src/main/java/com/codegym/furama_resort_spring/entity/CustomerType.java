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
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerTypeId;
    private String customerTypeName;

    @OneToMany(mappedBy = "customerTypeId")
    @JsonBackReference
    private List<Customer> customerList = new ArrayList<>();
}
