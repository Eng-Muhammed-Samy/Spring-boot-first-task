package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category insert(Category category){
        return categoryRepo.save(category);
    }
}
