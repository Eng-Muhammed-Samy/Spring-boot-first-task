package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.repository.CustomerRepo;
import com.fawry.ecommerceapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImple implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer insert(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerRepo.findAll();
    }

    public Optional<Customer> findCustomerById(Long id){
        return customerRepo.findById(id);
    }

    public Customer update(Customer customer){
        return customerRepo.save(customer);
    }

    public String delete(Long id){
        customerRepo.findById(id);
        return "deleted";
    }
}
