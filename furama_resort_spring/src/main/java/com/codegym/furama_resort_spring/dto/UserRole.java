package com.codegym.furama_resort_spring.dto;

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
public class UserRole {
    @EmbeddedId
    UserRoleKey id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "roleId")
    Role roleId;

    @ManyToOne
    @MapsId("userName")
    @JoinColumn(name = "userName")
    User userName;
}
