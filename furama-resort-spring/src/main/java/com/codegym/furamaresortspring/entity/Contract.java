package com.codegym.furamaresortspring.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractId;
    private Date contractStartDate;
    private Date contractStartEnd;
    private double contractDeposit;
    private double contractTotalMoney;

    @ManyToOne(targetEntity = Employee.class)
    private Employee employeeId;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customerId;
    @ManyToOne(targetEntity = ServiceResort.class)
    private ServiceResort serviceResortId;

    @OneToOne(mappedBy = "contractId")
    private ContractDetail contractDetail;

    public Contract() {
    }

    public Contract(Long contractId, Date contractStartDate, Date contractStartEnd, double contractDeposit,
            double contractTotalMoney, Employee employeeId, Customer customerId, ServiceResort serviceResortId,
            ContractDetail contractDetail) {
        this.contractId = contractId;
        this.contractStartDate = contractStartDate;
        this.contractStartEnd = contractStartEnd;
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

    public Date getContractStartEnd() {
        return contractStartEnd;
    }

    public void setContractStartEnd(Date contractStartEnd) {
        this.contractStartEnd = contractStartEnd;
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
    
}
