package com.codegym.furamaresortspring.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String customerId;
    private String customerName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerBirthDate;
    private boolean customerGender;
    private String customerIdentityCard;
    private String customerEmail;
    private String customerAddress;

    @OneToMany(mappedBy = "customerId")
    List<Contract> contractList = new ArrayList<>();

    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerTypeId;

    public Customer() {
    }

    public Customer(String customerId, String customerName, Date customerBirthDate, boolean customerGender, String customerIdentityCard, String customerEmail, String customerAddress, List<Contract> contractList, CustomerType customerTypeId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthDate = customerBirthDate;
        this.customerGender = customerGender;
        this.customerIdentityCard = customerIdentityCard;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.contractList = contractList;
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerBirthDate() {
        return customerBirthDate;
    }

    public void setCustomerBirthDate(Date customerBirthDate) {
        this.customerBirthDate = customerBirthDate;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdentityCard() {
        return customerIdentityCard;
    }

    public void setCustomerIdentityCard(String customerIdentityCard) {
        this.customerIdentityCard = customerIdentityCard;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public CustomerType getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerType customerTypeId) {
        this.customerTypeId = customerTypeId;
    }
}
