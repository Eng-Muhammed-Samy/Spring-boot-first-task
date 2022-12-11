package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fawry_user")
@Setter
@Getter
public class User extends BaseEntity<Long> {
    @Column
    @Email
    private String email;
    @Column
    @NotBlank
    private String password;
}
