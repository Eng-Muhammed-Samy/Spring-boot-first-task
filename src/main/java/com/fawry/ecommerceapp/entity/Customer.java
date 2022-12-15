package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "fawry_customer")
@Data
public class Customer extends BaseEntity<Long> {
    @Column
    private String name;
    @Column
    private String imgPath;
    @OneToOne
    private NormalUser normalUser;
}
