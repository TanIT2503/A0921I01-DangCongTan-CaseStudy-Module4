package com.codegym.furamaresortspring.dto;

import javax.validation.constraints.Min;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codegym.furamaresortspring.entity.AttachService;
import com.codegym.furamaresortspring.entity.Contract;

public class ContractDetailDto implements Validator {
    private Long contactDetailId;

    private Contract contractId;

    private AttachService attachServiceId;

    @Min(value = 0, message = "Not less than 0.")
    private int quantity;

    public ContractDetailDto() {
    }

    public ContractDetailDto(Long contactDetailId, Contract contractId, AttachService attachServiceId, int quantity) {
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

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public AttachService getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(AttachService attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        // TODO Auto-generated method stub

    }

}
