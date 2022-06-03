package com.codegym.furama_resort_spring.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String userName;
    private String passWord;

    @OneToOne(mappedBy = "userName")
    private Employee employee;

    @OneToMany(mappedBy = "userName")
    Set<UserRole> userRoles;
}
