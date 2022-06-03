package com.codegym.furama_resort_spring.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerTypeDto {

    private Long customerTypeId;
    private String customerTypeName;

    private List<CustomerDto> customerList = new ArrayList<>();

    public CustomerTypeDto() {
    }

    public CustomerTypeDto(Long customerTypeId , String customerTypeName , List<CustomerDto> customerList) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customerList = customerList;
    }

    public Long getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public List<CustomerDto> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<CustomerDto> customerList) {
        this.customerList = customerList;
    }
}
