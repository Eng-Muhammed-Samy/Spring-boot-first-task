package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

@Entity
@Table(name = "fawry_category")
@Data
public class Category extends BaseEntity<Long> {
    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Product> productsCategory;

}
