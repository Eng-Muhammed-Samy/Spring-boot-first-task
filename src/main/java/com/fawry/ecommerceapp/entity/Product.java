package com.fawry.ecommerceapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "fawry_products")
@Setter
@Getter
public class Product extends BaseEntity<Long> {
    @Column
    @NotBlank
    private String nameEn;
    @Column
    @NotNull
    private String nameAr;
    @Column
    @Min(value = 10)
    private Double price;
    @Column
    private Integer quantity;
    @Column
    private String imgPath;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "fawry_order_products",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id")
    )
    private Set<Order> orders =new HashSet<>();
    @ManyToOne
    private Category category;

}
