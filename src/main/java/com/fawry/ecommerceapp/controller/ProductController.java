package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.model.OrderModel;
import com.fawry.ecommerceapp.model.ProductModel;
import com.fawry.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addNewProduct(@RequestBody Product product){
        return productService.insert(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductModel findOneProduct(@PathVariable Long id){
        Product product = productService.findById(id).get();

        ProductModel productModel = new ProductModel();
        Set<OrderModel> orderModelList = new HashSet<>();
        product.getOrders().forEach(order -> {
            OrderModel orderModel = new OrderModel();
            orderModel.setId(order.getId());
            orderModel.setShipping(order.getShipping());
            orderModel.setTaxes(order.getTaxes());
            orderModel.setTotalSalary(order.getTotalSalary());
            orderModelList.add(orderModel);
        } );

        productModel.setId(product.getId());
        productModel.setNameEn(product.getNameEn());
        productModel.setNameAr(product.getNameAr());
        productModel.setImgPath(product.getImgPath());
        productModel.setPrice(product.getPrice());
        productModel.setQuantity(product.getQuantity());
//        productModel.setOrders(orderModelList);

        return productModel;
    }
}
