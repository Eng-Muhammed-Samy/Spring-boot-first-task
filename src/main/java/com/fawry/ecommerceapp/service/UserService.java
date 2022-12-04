package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.User;
import com.fawry.ecommerceapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User addNewUser(User user){
        return userRepo.save(user);
    }

    public User update(User user){
        return userRepo.save(user);
    }

    public Optional<User> findById(Long id) {
        return userRepo.findById(id);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public String delete(Long id){
        userRepo.deleteById(id);
        return "deleted";
    }
}
