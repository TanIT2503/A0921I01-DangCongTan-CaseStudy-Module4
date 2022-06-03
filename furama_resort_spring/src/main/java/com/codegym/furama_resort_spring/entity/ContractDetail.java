package com.codegym.furama_resort_spring.entity;

import lombok.AllArgsConstructor;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactDetailId;

    @ManyToOne(targetEntity = Contract.class)
    private Contract contractId;

    @ManyToOne(targetEntity = AttachService.class)
    private AttachService attachServiceId;

    private int quantity;
}
