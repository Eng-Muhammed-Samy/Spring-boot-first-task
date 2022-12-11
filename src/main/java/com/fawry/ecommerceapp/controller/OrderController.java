package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.model.OrderModel;
import com.fawry.ecommerceapp.service.implementation.OrderServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderServiceImple orderService;

    @PostMapping
    public Order addNewOrder(@RequestBody Order order){
        return orderService.insert(order);
    }
    @GetMapping
    public List<Order> findAllOrders(){
        return orderService.findAllOrders();
    }
    @GetMapping("/{id}")
    public OrderModel findOrderById(@PathVariable Long id){
        Order order = orderService.findOrderById(id);
        OrderModel orderModel = new OrderModel();
        orderModel.setId(order.getId());
        orderModel.setShipping(order.getShipping());
        orderModel.setTaxes(order.getTaxes());
        orderModel.setTotalSalary(order.getTotalSalary());
//        orderModel.setProducts(order.getProducts());

        return orderModel;
    }
    @PutMapping
    public Order updateOrder(@RequestBody Order order){
        return orderService.update(order);
    }
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id){
        return orderService.delete(id);
    }
}
