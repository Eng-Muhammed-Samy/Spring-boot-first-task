package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import com.fawry.ecommerceapp.model.ProductModel;
import com.fawry.ecommerceapp.repository.ProductRepo;
import com.fawry.ecommerceapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImple implements ProductService {
    private final ProductRepo productRepo;

    public Product insert(Product product){
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> findProductById(Long id){
        Optional<Product> product = productRepo.findById(id);
        if (product.isPresent()){
            return product;
        }
        throw new RecordNotFoundException("Product Not Found");
    }

    public Product update(Product product) {
        return productRepo.save(product);
    }

    public String delete(Long id){
         productRepo.deleteById(id);
         return "deleted";
    }
}
