package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Customer;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import com.fawry.ecommerceapp.repository.CustomerRepo;
import com.fawry.ecommerceapp.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImple implements CustomerService {
    private final CustomerRepo customerRepo;

    public Customer insert(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerRepo.findAll();
    }

    public Customer findCustomerById(Long id){
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()){
            return customer.get();
        }
        throw new RecordNotFoundException("Customer Not FOund");
    }

    public Customer update(Customer customer){
        return customerRepo.save(customer);
    }

    public String delete(Long id){
        customerRepo.findById(id);
        return "deleted";
    }
}
