package com.codegym.furama_resort_spring.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(generator="my_seq")
    @SequenceGenerator(name="my_seq",sequenceName="KH-", allocationSize=0001)
    private String customerId;
    private String customerName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerBirthDate;
    private boolean customerGender;
    private long customerIdentityCard;
    private String customerEmail;
    private String customerAddress;

    @OneToMany(mappedBy = "customerId")
    List<Contract> contractList = new ArrayList<>();

    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerTypeId;
}
