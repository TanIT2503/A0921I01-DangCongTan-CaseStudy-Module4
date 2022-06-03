package com.codegym.furama_resort_spring.dto;

import java.util.ArrayList;
import java.util.List;

public class AttachServiceDto {

    private Long attachServiceId;
    private String attachServiceName;
    private double attachServiceCost;
    private int attachServiceUnit;
    private String attachServiceStatus;

    private List<ContractDetailDto> contractDetails = new ArrayList<>();

    public AttachServiceDto() {
    }

    public AttachServiceDto(Long attachServiceId , String attachServiceName , double attachServiceCost , int attachServiceUnit , String attachServiceStatus , List<ContractDetailDto> contractDetails) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServiceCost = attachServiceCost;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
        this.contractDetails = contractDetails;
    }

    public Long getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(Long attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public double getAttachServiceCost() {
        return attachServiceCost;
    }

    public void setAttachServiceCost(double attachServiceCost) {
        this.attachServiceCost = attachServiceCost;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }

    public List<ContractDetailDto> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetailDto> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
