package com.codegym.furama_resort_spring.dto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDto implements Validator {

    private String customerId;

    @NotEmpty(message = "Do not empty.")
    private String customerName;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Pattern(regexp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$", message = "Wrong Format Date.")
    private Date customerBirthDate;
    private boolean customerGender;

    @Pattern(regexp = "^([0-9]{9})+([0-9]{12})$", message = "Wrong identifier format.")
    private long customerIdentityCard;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong Email Format.")
    private String customerEmail;
    private String customerAddress;

    List<ContractDto> contractDtoList = new ArrayList<>();

    private CustomerTypeDto customerTypeId;

    public CustomerDto() {
    }

    public CustomerDto(String customerId , String customerName , Date customerBirthDate , boolean customerGender , long customerIdentityCard , String customerEmail , String customerAddress , List<ContractDto> contractDtoList , CustomerTypeDto customerTypeId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthDate = customerBirthDate;
        this.customerGender = customerGender;
        this.customerIdentityCard = customerIdentityCard;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.contractDtoList = contractDtoList;
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

    public long getCustomerIdentityCard() {
        return customerIdentityCard;
    }

    public void setCustomerIdentityCard(long customerIdentityCard) {
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

    public List<ContractDto> getContractDtoList() {
        return contractDtoList;
    }

    public void setContractDtoList(List<ContractDto> contractDtoList) {
        this.contractDtoList = contractDtoList;
    }

    public CustomerTypeDto getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(CustomerTypeDto customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target , Errors errors) {

    }
}
