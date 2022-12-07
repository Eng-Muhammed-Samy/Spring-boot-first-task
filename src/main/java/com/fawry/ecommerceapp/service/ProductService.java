package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

     Product insert(Product product);

     List<Product> findAllProducts();

     Product findProductById(Long id);

     Product update(Product product);

     String delete(Long id);
}
