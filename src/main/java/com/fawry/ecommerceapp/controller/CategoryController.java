package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.service.implementation.CategoryServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImple categoryService;

    @PostMapping
    public Category insertCategory(@RequestBody Category category){
        return categoryService.insert(category);
    }

    @GetMapping("/{id}")
    public Optional<Category> findCategoryById(@PathVariable Long id){
        return categoryService.findCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id){
        categoryService.delete(id);
        return "deleted";
    }

    @PutMapping
    public Category updateCategory(@RequestBody Category category){
        return categoryService.update(category);
    }

    @GetMapping
    public List<Category> findAllCategories(){
        return categoryService.findAllCategories();
    }
}
