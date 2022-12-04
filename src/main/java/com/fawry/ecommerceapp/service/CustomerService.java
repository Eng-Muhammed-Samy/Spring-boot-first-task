package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.repository.CustomerRepo;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

     Customer insert(Customer customer);

     List<Customer> findAllCustomer();

     Optional<Customer> findCustomerById(Long id);

     Customer update(Customer customer);

     String delete(Long id);
}
