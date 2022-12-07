package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.model.ProductModel;

public final class ProductMapper {

    public static ProductModel mapper(Product product){
        ProductModel productModel = new ProductModel();
        productModel.setId(product.getId());
        productModel.setNameEn(product.getNameEn());
        productModel.setNameAr(product.getNameAr());
        productModel.setImgPath(product.getImgPath());
        productModel.setPrice(product.getPrice());
        productModel.setQuantity(product.getQuantity());
        return productModel;
    }
}
