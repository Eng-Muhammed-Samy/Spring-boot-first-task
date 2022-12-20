package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.model.OrderModel;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public static OrderModel mapper(Order order){
        OrderModel orderModel = new OrderModel();
        orderModel.setId(order.getId());
        orderModel.setTaxes(order.getTaxes());
        orderModel.setShipping(order.getShipping());
        orderModel.setTotalSalary(order.getTotalSalary());
        return orderModel;
    }

    public static Order unMap(OrderModel orderModel){
        Order order = new Order();
        order.setId(orderModel.getId());
        order.setTaxes(orderModel.getTaxes());
        order.setShipping(orderModel.getShipping());
        order.setTotalSalary(orderModel.getTotalSalary());
        return order;
    }
}
