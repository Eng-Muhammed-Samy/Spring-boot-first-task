package com.fawry.ecommerceapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "fawry_orders")
@Setter
@Getter
public class Order extends BaseEntity<Long> {
    @Column(name = "shipping", precision = 0)
    private Double shipping;
    @Column(name = "taxes", precision = 0)
    private Double taxes;
    @Column(name = "total_salary", precision = 0)
    private Double totalSalary;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "fawry_order_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    @JsonIgnore
    private Set<Product> products =new HashSet<>();
}
