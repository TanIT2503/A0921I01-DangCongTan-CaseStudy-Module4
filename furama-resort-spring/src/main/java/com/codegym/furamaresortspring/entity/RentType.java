package com.codegym.furamaresortspring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentTypeId;
    private String rentTypeName;

    @OneToMany(mappedBy = "rentTypeId")
    @JsonBackReference
    List<ServiceResort> serviceResortServices = new ArrayList<>();

    public RentType() {
    }

    public RentType(Long rentTypeId, String rentTypeName, List<ServiceResort> serviceResortServices) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.serviceResortServices = serviceResortServices;
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

    public List<ServiceResort> getServiceResortServices() {
        return serviceResortServices;
    }

    public void setServiceResortServices(List<ServiceResort> serviceResortServices) {
        this.serviceResortServices = serviceResortServices;
    }
    
}
