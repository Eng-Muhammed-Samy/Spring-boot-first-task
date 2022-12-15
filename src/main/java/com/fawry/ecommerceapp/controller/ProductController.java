package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.mapper.OrderMapper;
import com.fawry.ecommerceapp.mapper.ProductMapper;
import com.fawry.ecommerceapp.model.OrderModel;
import com.fawry.ecommerceapp.model.ProductModel;
import com.fawry.ecommerceapp.service.implementation.ProductServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceImple productService;

    @PostMapping
    public Product addNewProduct(@RequestBody Product product){
        return productService.insert(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public ProductModel findOneProduct(@PathVariable Long id){
        Product product = productService.findProductById(id).get();

        Set<OrderModel> orderModelList = new HashSet<>();
        //orderMapping to orderDto
        product.getOrders().forEach(order -> orderModelList.add(OrderMapper.mapper(order)));

        return ProductMapper.mapper(product);
    }
}
