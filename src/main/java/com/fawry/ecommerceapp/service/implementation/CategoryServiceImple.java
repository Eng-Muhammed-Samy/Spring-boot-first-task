package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.Category;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import com.fawry.ecommerceapp.repository.CategoryRepo;
import com.fawry.ecommerceapp.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImple implements CategoryService {

    private final CategoryRepo categoryRepo;

    public Category insert(Category category){
        return categoryRepo.save(category);
    }
    public Category findCategoryById(Long id){
        Optional<Category> category = categoryRepo.findById(id);
        if (category.isPresent()){
            return category.get();
        }
        throw new RecordNotFoundException("category Not Found");
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
