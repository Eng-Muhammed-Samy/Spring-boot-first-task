package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.model.OrderModel;

public final class OrderMapper {

    public static OrderModel mapper(Order order){
        OrderModel orderModel = new OrderModel();
        orderModel.setId(order.getId());
        orderModel.setShipping(order.getShipping());
        orderModel.setTaxes(order.getTaxes());
        orderModel.setTotalSalary(order.getTotalSalary());
        return orderModel;
    }
}
