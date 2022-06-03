package com.codegym.furama_resort_spring.dto;

import java.util.Date;

public class ContractDto
{

    private Long contractId;
    private Date contractStartDate;
    private Date contractStartEnd;
    private double contractDeposit;
    private double contractTotalMoney;

    private Employee employeeId;
    private CustomerDto customerId;
    private ResortServices resortServiceId;
    private ContractDetailDto contractDetail;
}
