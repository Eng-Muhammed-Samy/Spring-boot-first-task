package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

     Order insert(Order order);

     List<Order> findAllOrders();

     Order findOrderById(Long id);

     Order update(Order order);

     String delete(Long id);
}
