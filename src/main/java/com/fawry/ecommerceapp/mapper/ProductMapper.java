package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.model.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

   public static ProductModel mapper(Product product){
      ProductModel productModel = new ProductModel();
      productModel.setId(product.getId());
      productModel.setNameEn(product.getNameEn());
      productModel.setNameAr(product.getNameAr());
      productModel.setImgPath(product.getImgPath());
      productModel.setQuantity(product.getQuantity());
      productModel.setPrice(product.getPrice());

      return productModel;
   }

  public static Product unMap(ProductModel productModel){
     Product product = new Product();
     product.setId(productModel.getId());
     product.setNameEn(productModel.getNameEn());
     product.setNameAr(productModel.getNameAr());
     product.setImgPath(productModel.getImgPath());
     product.setQuantity(productModel.getQuantity());
     product.setPrice(productModel.getPrice());

     return product;
  }
}
