package com.codegym.furamaresortspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
