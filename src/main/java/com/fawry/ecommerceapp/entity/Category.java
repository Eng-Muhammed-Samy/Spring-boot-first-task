package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "fawry_category")
@Setter
@Getter
public class Category extends BaseEntity<Long> {
    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Product> productsCategory;

}
