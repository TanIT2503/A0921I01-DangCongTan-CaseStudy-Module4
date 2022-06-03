package com.codegym.furama_resort_spring.dto;


import java.util.ArrayList;

public class ResortServicesDto {

    private Long resortServiceId;
    private String resortServiceName;
    private float resortServiceArea;
    private double resortServiceCost;
    private int resortServiceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private String numberOfFloors;


    private ServiceType serviceTypeId;


    private RentType rentTypeId;

    List<Contract> contractList = new ArrayList<>();
}
