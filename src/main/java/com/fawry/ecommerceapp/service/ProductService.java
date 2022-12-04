package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.model.ProductModel;
import com.fawry.ecommerceapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product insert(Product product){
        return productRepo.save(product);
    }

    public List<Product> findAll(){
        return productRepo.findAll();
    }

    public Optional<Product> findById(Long id){
        return productRepo.findById(id);
    }
}
