package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer insert(Customer customer){
        return customerRepo.save(customer);
    }
}
