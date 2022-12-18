package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Entity
@Table(name = "fawry_user")
@Data
public class User extends BaseEntity<Long> {

    private String userName;

    @Column
    @Email
    private String email;
    @Column
    @NotBlank
    private String password;
}
