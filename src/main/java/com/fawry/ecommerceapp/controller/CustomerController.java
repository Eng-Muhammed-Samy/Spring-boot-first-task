package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer insertNewCustomer(@RequestBody Customer customer){
        return customerService.insert(customer);
    }
}
