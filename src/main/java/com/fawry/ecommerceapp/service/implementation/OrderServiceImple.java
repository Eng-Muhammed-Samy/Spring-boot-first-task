package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
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

    public Order findOrderById(Long id){
        Optional<Order> order = orderRepo.findById(id);
        if (order.isPresent()){
            return order.get();
        }

        throw new RecordNotFoundException("Order Not Found");
    }

    public Order update(Order order){
        return orderRepo.save(order);
    }

    public String delete(Long id){
         orderRepo.deleteById(id);
         return "deleted";
    }
}