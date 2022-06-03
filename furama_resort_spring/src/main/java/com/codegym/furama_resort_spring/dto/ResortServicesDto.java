package com.codegym.furama_resort_spring.dto;


import java.util.ArrayList;
import java.util.List;

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


    private RentTypeDto rentTypeId;

    List<ContractDto> contractList = new ArrayList<>();

    public ResortServicesDto() {
    }

    public ResortServicesDto(Long resortServiceId , String resortServiceName , float resortServiceArea , double resortServiceCost , int resortServiceMaxPeople , String standardRoom , String descriptionOtherConvenience , String poolArea , String numberOfFloors , ServiceType serviceTypeId , RentTypeDto rentTypeId , List<ContractDto> contractList) {
        this.resortServiceId = resortServiceId;
        this.resortServiceName = resortServiceName;
        this.resortServiceArea = resortServiceArea;
        this.resortServiceCost = resortServiceCost;
        this.resortServiceMaxPeople = resortServiceMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceTypeId = serviceTypeId;
        this.rentTypeId = rentTypeId;
        this.contractList = contractList;
    }
}
