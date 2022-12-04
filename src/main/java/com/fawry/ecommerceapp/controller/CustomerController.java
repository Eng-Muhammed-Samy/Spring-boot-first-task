package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer insertNewCustomer(@RequestBody Customer customer){
        return customerService.insert(customer);
    }

    @GetMapping
    public List<Customer> findAllCustomer(){
        return customerService.findAllCustomer();
    }

    @GetMapping("/{id}")
    public Optional<Customer> findCustomerById(Long id){
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
