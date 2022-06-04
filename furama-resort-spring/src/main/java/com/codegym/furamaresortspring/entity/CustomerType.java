package com.codegym.furamaresortspring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerTypeId;
    private String customerTypeName;

    @OneToMany(mappedBy = "customerTypeId")
    @JsonBackReference
    private List<Customer> customerList = new ArrayList<>();

    public CustomerType() {
    }

    public CustomerType(Long customerTypeId, String customerTypeName, List<Customer> customerList) {
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

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
}
