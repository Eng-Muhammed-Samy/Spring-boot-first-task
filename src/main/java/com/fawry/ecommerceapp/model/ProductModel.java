package com.fawry.ecommerceapp.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class ProductModel implements Serializable {
    private Long id;
    private String nameEn;
    private String nameAr;
    private Double price;
    private Integer quantity;
    private String imgPath;

    private Set<OrderModel> orders;

}
