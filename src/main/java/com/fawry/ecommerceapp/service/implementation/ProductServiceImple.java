package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.model.ProductModel;
import com.fawry.ecommerceapp.repository.ProductRepo;
import com.fawry.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImple implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product insert(Product product){
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> findProductById(Long id){
        return productRepo.findById(id);
    }

    public Product update(Product product) {
        return productRepo.save(product);
    }

    public String delete(Long id){
         productRepo.deleteById(id);
         return "deleted";
    }
}
