package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.model.CategoryModel;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {
    CategoryModel map(Category category);

    Category unMap(CategoryModel categoryModel);

}
