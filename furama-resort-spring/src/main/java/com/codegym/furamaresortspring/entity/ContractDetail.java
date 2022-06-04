package com.codegym.furamaresortspring.entity;


import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactDetailId;

    @ManyToOne(targetEntity = Contract.class)
    private Contract contractId;

    @ManyToOne(targetEntity = AttachService.class)
    private AttachService attachServiceId;

    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(Long contactDetailId, Contract contractId, AttachService attachServiceId, int quantity) {
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
    
}
