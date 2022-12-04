package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category insert(Category category){
        return categoryRepo.save(category);
    }

    public Optional<Category> findCategoryById(Long id){
        return categoryRepo.findById(id);
    }

    public String delete(Long id){
        categoryRepo.deleteById(id);
        return "deleted";
    }

    public Category update(Category category){
        return categoryRepo.save(category);
    }

    public List<Category> findAllCategories(){
        return categoryRepo.findAll();
    }
}
