package com.fawry.ecommerceapp.model;


import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class OrderModel implements Serializable {
    private Long id;
    private Double shipping;

    private Double taxes;

    private Double totalSalary;

    private Set<ProductModel> products;

}
