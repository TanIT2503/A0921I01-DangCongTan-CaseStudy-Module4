package com.codegym.furama_resort_spring.dto;

public class ContractDetailDto {

    private Long contactDetailId;

    private ContractDto contractId;

    private AttachServiceDto attachServiceId;
    private int quantity;

    public ContractDetailDto() {
    }

    public ContractDetailDto(Long contactDetailId , ContractDto contractId , AttachServiceDto attachServiceId , int quantity) {
        this.contactDetailId = contactDetailId;
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quantity = quantity;
    }

    public Long getContactDetailId() {
        return contactDetailId;
    }

    public void setContactDetailId(Long contactDetailId) {
        this.contactDetailId = contactDetailId;
    }

    public ContractDto getContractId() {
        return contractId;
    }

    public void setContractId(ContractDto contractId) {
        this.contractId = contractId;
    }

    public AttachServiceDto getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(AttachServiceDto attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
