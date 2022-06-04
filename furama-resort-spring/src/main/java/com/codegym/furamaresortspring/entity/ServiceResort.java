package com.codegym.furamaresortspring.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
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

    public ServiceResort() {
    }

    public ServiceResort(Long serviceResortId, String serviceResortName, float serviceResortArea,
            double serviceResortCost, int serviceResortMaxPeople, String standardRoom,
            String descriptionOtherConvenience, float poolArea, int numberOfFloors, ServiceType serviceTypeId,
            RentType rentTypeId, List<Contract> contractList) {
        this.serviceResortId = serviceResortId;
        this.serviceResortName = serviceResortName;
        this.serviceResortArea = serviceResortArea;
        this.serviceResortCost = serviceResortCost;
        this.serviceResortMaxPeople = serviceResortMaxPeople;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.serviceTypeId = serviceTypeId;
        this.rentTypeId = rentTypeId;
        this.contractList = contractList;
    }

    public Long getServiceResortId() {
        return serviceResortId;
    }

    public void setServiceResortId(Long serviceResortId) {
        this.serviceResortId = serviceResortId;
    }

    public String getServiceResortName() {
        return serviceResortName;
    }

    public void setServiceResortName(String serviceResortName) {
        this.serviceResortName = serviceResortName;
    }

    public float getServiceResortArea() {
        return serviceResortArea;
    }

    public void setServiceResortArea(float serviceResortArea) {
        this.serviceResortArea = serviceResortArea;
    }

    public double getServiceResortCost() {
        return serviceResortCost;
    }

    public void setServiceResortCost(double serviceResortCost) {
        this.serviceResortCost = serviceResortCost;
    }

    public int getServiceResortMaxPeople() {
        return serviceResortMaxPeople;
    }

    public void setServiceResortMaxPeople(int serviceResortMaxPeople) {
        this.serviceResortMaxPeople = serviceResortMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
    
}
