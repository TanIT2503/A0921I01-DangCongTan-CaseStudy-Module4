package com.codegym.furama_resort_spring.entity;

import lombok.*;

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
