package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public Category insertCategory(@RequestBody Category category){
        return categoryService.insert(category);
    }
}
