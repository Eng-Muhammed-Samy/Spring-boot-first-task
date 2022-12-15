package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ProductServiceTests {

    @Autowired ProductService productService;

    @Test
    void findProductByIdNotFoundTest(){
        Optional<Product> product = productService.findProductById(100l);
        assertEquals(false, product.isPresent());
    }

    @Test
    void findProductByIdIsFoundTest(){
      Optional<Product> product = productService.findProductById(1l);
       assertEquals(true, product.isPresent());
    }

}
