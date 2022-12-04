package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.repository.OrderRepo;
import com.fawry.ecommerceapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImple implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public Order insert(Order order){
        return  orderRepo.save(order);
    }

    public List<Order> findAllOrders(){
        return orderRepo.findAll();
    }

    public Optional<Order> findOrderById(Long id){
        return orderRepo.findById(id);
    }

    public Order update(Order order){
        return orderRepo.save(order);
    }

    public String delete(Long id){
         orderRepo.deleteById(id);
         return "deleted";
    }
}