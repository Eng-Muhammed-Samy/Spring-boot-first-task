package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.service.implementation.CategoryServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryServiceImple categoryService;

    @PostMapping
    public Category insertCategory(@RequestBody Category category){
        return categoryService.insert(category);
    }

    @GetMapping("/{id}")
    public Category findCategoryById(@PathVariable Long id){
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
