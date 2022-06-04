package com.codegym.furamaresortspring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceTypeId;
    private String serviceTypeName;

    @OneToMany(mappedBy = "serviceTypeId")
    @JsonBackReference
    List<ServiceResort> serviceResortServices = new ArrayList<>();

    public ServiceType() {
    }

    public ServiceType(Long serviceTypeId, String serviceTypeName, List<ServiceResort> serviceResortServices) {
        this.serviceTypeId = serviceTypeId;
        this.serviceTypeName = serviceTypeName;
        this.serviceResortServices = serviceResortServices;
    }

    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public List<ServiceResort> getServiceResortServices() {
        return serviceResortServices;
    }

    public void setServiceResortServices(List<ServiceResort> serviceResortServices) {
        this.serviceResortServices = serviceResortServices;
    }
    
}
