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
public class ServiceResort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceResortId;
    private String serviceResortName;
    private float serviceResortArea;
    private double serviceResortCost;
    private int serviceResortMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private float poolArea;
    private int numberOfFloors;

    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceTypeId;

    @ManyToOne(targetEntity = RentType.class)
    private RentType rentTypeId;

    @OneToMany(mappedBy = "serviceResortId")
    List<Contract> contractList = new ArrayList<>();
}
