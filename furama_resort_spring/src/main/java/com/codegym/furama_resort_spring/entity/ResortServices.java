package com.codegym.furama_resort_spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResortServices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String resortServiceId;
    private String resortServiceName;
    private float resortServiceArea;
    private double resortServiceCost;
    private int resortServiceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private String numberOfFloors;

    @ManyToOne(targetEntity = ServiceType.class)
    private ServiceType serviceTypeId;

    @ManyToOne(targetEntity = RentType.class)
    private RentType rentTypeId;

    @OneToMany(mappedBy = "resortServiceId")
    List<Contract> contractList = new ArrayList<>();
}
