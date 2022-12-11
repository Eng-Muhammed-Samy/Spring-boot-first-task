package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.service.implementation.CustomerServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerServiceImple customerService;

    @PostMapping
    public Customer insertNewCustomer(@RequestBody Customer customer){
        return customerService.insert(customer);
    }

    @GetMapping
    public List<Customer> findAllCustomer(){
        return customerService.findAllCustomer();
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(Long id){
        return customerService.findCustomerById(id);
    }

    @PutMapping
    public Customer update(Customer customer){
        return customerService.update(customer);
    }

    @DeleteMapping
    public String delete(Long id){
        customerService.delete(id);
        return "deleted";
    }
}
