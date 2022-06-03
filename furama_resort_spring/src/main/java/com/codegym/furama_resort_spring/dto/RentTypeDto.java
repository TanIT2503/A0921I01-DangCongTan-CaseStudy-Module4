package com.codegym.furama_resort_spring.dto;

import java.util.ArrayList;
import java.util.List;

public class RentTypeDto {

    private Long rentTypeId;
    private String rentTypeName;

    List<ResortServicesDto> resortServices = new ArrayList<>();

    public RentTypeDto() {
    }

    public RentTypeDto(Long rentTypeId , String rentTypeName , List<ResortServicesDto> resortServices) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.resortServices = resortServices;
    }

    public Long getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Long rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public List<ResortServicesDto> getResortServices() {
        return resortServices;
    }

    public void setResortServices(List<ResortServicesDto> resortServices) {
        this.resortServices = resortServices;
    }
}
