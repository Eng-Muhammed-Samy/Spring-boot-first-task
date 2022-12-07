package com.fawry.ecommerceapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "fawry_products")
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
//    @JsonIgnore
    private Set<Order> orders =new HashSet<>();


    @ManyToOne
    private Category category;
    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameAr() {
        return nameAr;
    }
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getImgPath() {
        return imgPath;
    }
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Set<Order> getOrders() {
        return orders;
    }
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
