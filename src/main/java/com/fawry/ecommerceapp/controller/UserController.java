package com.fawry.ecommerceapp.controller;

import com.fawry.ecommerceapp.entity.NormalUser;
import com.fawry.ecommerceapp.service.implementation.UserServiceImple;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImple userService;

    @PostMapping
    public NormalUser addUser(@RequestBody NormalUser normalUser){
        return userService.insert(normalUser);
    }

    @GetMapping
    public List<NormalUser> getAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public NormalUser findUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @PutMapping
    public NormalUser updateUser(@RequestBody NormalUser normalUser){
        return userService.update(normalUser);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(Long id){
        return userService.delete(id);
    }

}
