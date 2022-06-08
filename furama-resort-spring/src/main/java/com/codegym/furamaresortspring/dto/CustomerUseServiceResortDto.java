package com.codegym.furamaresortspring.dto;

import com.codegym.furamaresortspring.entity.AttachService;
import com.codegym.furamaresortspring.entity.Contract;
import com.codegym.furamaresortspring.entity.ContractDetail;
import com.codegym.furamaresortspring.entity.Customer;
import com.codegym.furamaresortspring.entity.CustomerType;
import com.codegym.furamaresortspring.entity.RentType;
import com.codegym.furamaresortspring.entity.ServiceResort;
import com.codegym.furamaresortspring.entity.ServiceType;

public class CustomerUseServiceResortDto {
    private Long customerUseServiceId;
    private Customer customerId;
    private CustomerType customerTypeId;
    private Contract contractId;
    private ServiceResort serviceResortId;
    private RentType rentTypeId;
    private ServiceType serviceTypeId;
    private ContractDetail contractDetailId;
    private AttachService attachServiceId;

    public CustomerUseServiceResortDto() {
    }

    public CustomerUseServiceResortDto(Long customerUseServiceId, Customer customerId, CustomerType customerTypeId,
            Contract contractId, ServiceResort serviceResortId, RentType rentTypeId, ServiceType serviceTypeId,
            ContractDetail contractDetailId, AttachService attachServiceId) {
        this.customerUseServiceId = customerUseServiceId;
        this.customerId = customerId;
        this.customerTypeId = customerTypeId;
        this.contractId = contractId;
        this.serviceResortId = serviceResortId;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
        this.contractDetailId = contractDetailId;
        this.attachServiceId = attachServiceId;
    }

    public Long getCustomerUseServiceId() {
        return customerUseServiceId;
    }

    public void setCustomerUseServiceId(Long customerUseServiceId) {
        this.customerUseServiceId = customerUseServiceId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerType customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Contract getContractId() {
        return contractId;
    }

    public void setContractId(Contract contractId) {
        this.contractId = contractId;
    }

    public ServiceResort getServiceResortId() {
        return serviceResortId;
    }

    public void setServiceResortId(ServiceResort serviceResortId) {
        this.serviceResortId = serviceResortId;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public ContractDetail getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(ContractDetail contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public AttachService getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(AttachService attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

}
