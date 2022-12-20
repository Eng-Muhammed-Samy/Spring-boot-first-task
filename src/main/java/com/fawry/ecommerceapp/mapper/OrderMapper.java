package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.model.OrderModel;
import org.mapstruct.Mapper;

@Mapper

public interface OrderMapper {

    OrderModel mapper(Order order);

    Order unMap(OrderModel orderModel);
}
