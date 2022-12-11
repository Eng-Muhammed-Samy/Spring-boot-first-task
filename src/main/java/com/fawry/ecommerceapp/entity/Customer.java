package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fawry_customer")
@Setter
@Getter
public class Customer extends BaseEntity<Long> {
    @Column
    private String name;
    @Column
    private String imgPath;
    @OneToOne
    private User user;
}
