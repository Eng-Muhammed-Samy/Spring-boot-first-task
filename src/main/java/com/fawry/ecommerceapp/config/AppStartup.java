package com.fawry.ecommerceapp.config;

import com.fawry.ecommerceapp.entity.Order;
import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.service.OrderService;
import com.fawry.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class AppStartup implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Override
    public void run(String... args) throws Exception {
        if (orderService.findAllOrders().isEmpty()) {
            addOrders();
        }
    }

    private void addOrders() {
        Set<Product> products1 = new HashSet<>();
        Set<Product> products2 = new HashSet<>();
        Product product1 = new Product();
        product1.setNameEn("shirt");
        product1.setNameAr("قميص");
        product1.setImgPath("shirt.png");
        product1.setPrice(250.20);
        product1.setQuantity(5);
        productService.insert(product1);


        Product product2 = new Product();
        product2.setNameEn("paints");
        product2.setNameAr("بنطلون");
        product2.setImgPath("paints.png");
        product2.setPrice(125.0);
        product2.setQuantity(2);
        productService.insert(product2);

        Product product3 = new Product();
        product3.setNameEn("skirt");
        product3.setNameAr("تنوره");
        product3.setImgPath("skirt.png");
        product3.setPrice(200.50);
        product3.setQuantity(6);
        productService.insert(product3);

        Product product4 = new Product();
        product4.setNameEn("coat");
        product4.setNameAr("معطف");
        product4.setImgPath("coat.png");
        product4.setPrice(650.00);
        product4.setQuantity(5);
        productService.insert(product4);

        Product product5 = new Product();
        product5.setNameEn("suit");
        product5.setNameAr("بدله");
        product5.setImgPath("suit.png");
        product5.setPrice(1000.00);
        product5.setQuantity(3);
        productService.insert(product5);

        products1.add(product1);
        products1.add(product2);
        products1.add(product3);

        Order order = new Order();
        order.setShipping(2.50);
        order.setTaxes(10.00);
        order.setTotalSalary(140.50);
        order.setProducts(products1);
        products2.add(product4);
        products2.add(product5);
        orderService.insert(order);

        Order order2 = new Order();
        order2.setShipping(5.50);
        order2.setTaxes(12.00);
        order2.setTotalSalary(1500.50);
        order2.setProducts(products2);
        orderService.insert(order2);
    }

}
