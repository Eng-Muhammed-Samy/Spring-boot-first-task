package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.model.ProductModel;
import org.mapstruct.Mapper;


@Mapper
public interface ProductMapper {

   ProductModel mapper(Product product);

   Product unMap(ProductModel productModel);
}
