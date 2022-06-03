package com.codegym.furama_resort_spring.entity;
import lombok.*;

import javax.persistence.*;
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
