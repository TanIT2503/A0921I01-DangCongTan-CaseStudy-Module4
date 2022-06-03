package com.codegym.furama_resort_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleKey implements Serializable {
    @Column(name = "roleId")
    Long roleId;

    @Column(name = "userName")
    String userName;
}
