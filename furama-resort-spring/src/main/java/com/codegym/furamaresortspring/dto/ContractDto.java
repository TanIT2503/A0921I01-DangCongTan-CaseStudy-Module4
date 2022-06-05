package com.codegym.furamaresortspring.dto;

import java.sql.Date;

import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.codegym.furamaresortspring.entity.ContractDetail;
import com.codegym.furamaresortspring.entity.Customer;
import com.codegym.furamaresortspring.entity.Employee;
import com.codegym.furamaresortspring.entity.ServiceResort;

public class ContractDto implements Validator {
    private Long contractId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date contractStartDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date contractEndDate;
    @Min(value = 0, message = "Not less than 0.")
    private double contractDeposit;
    @Min(value = 0, message = "Not less than 0.")
    private double contractTotalMoney;

    private Employee employeeId;
    private Customer customerId;
    private ServiceResort serviceResortId;

    private ContractDetail contractDetail;

    public ContractDto() {
    }

    public ContractDto(Long contractId, Date contractStartDate, Date contractEndDate,
            @Min(value = 0, message = "Not less than 0.") double contractDeposit,
            @Min(value = 0, message = "Not less than 0.") double contractTotalMoney, Employee employeeId,
            Customer customerId, ServiceResort serviceResortId, ContractDetail contractDetail) {
        this.contractId = contractId;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceResortId = serviceResortId;
        this.contractDetail = contractDetail;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public ServiceResort getServiceResortId() {
        return serviceResortId;
    }

    public void setServiceResortId(ServiceResort serviceResortId) {
        this.serviceResortId = serviceResortId;
    }

    public ContractDetail getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(ContractDetail contractDetail) {
        this.contractDetail = contractDetail;
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
