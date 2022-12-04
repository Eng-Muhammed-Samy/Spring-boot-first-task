package com.fawry.ecommerceapp.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "fawry_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Product> productsCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
