package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.entity.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

     Category insert(Category category);

     List<Category> findAllCategories();

     Optional<Category> findCategoryById(Long id);

     Category update(Category category);

     String delete(Long id);
}
