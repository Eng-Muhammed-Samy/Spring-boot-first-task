package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public Order insert(Order order){
        return  orderRepo.save(order);
    }

    public List<Order> findAllOrders(){
        return orderRepo.findAll();
    }

    public Optional<Order> findById(Long id){
        return orderRepo.findById(id);
    }
}