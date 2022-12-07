package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "fawry_category")
public class Category extends BaseEntity<Long> {


    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Product> productsCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProductsCategory() {
        return productsCategory;
    }

    public void setProductsCategory(Set<Product> productsCategory) {
        this.productsCategory = productsCategory;
    }
}
