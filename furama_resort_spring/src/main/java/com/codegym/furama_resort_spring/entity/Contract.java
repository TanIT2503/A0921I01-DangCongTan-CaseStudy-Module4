package com.codegym.furama_resort_spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    @ManyToOne(targetEntity = ResortServices.class)
    private ResortServices resortServiceId;

    @OneToOne(mappedBy = "contractId")
    private ContractDetail contractDetail;
}
