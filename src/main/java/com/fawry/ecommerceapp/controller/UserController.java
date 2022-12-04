package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.User;
import com.fawry.ecommerceapp.service.implementation.UserServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserServiceImple userService;

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.insert(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(Long id){
        return userService.delete(id);
    }

}
