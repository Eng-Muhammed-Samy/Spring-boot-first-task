package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.User;

import java.util.List;

public interface UserService {

     User insert(User user);

     List<User> findAllUsers();

     User findUserById(Long id);

     User update(User product);

     User finUserByEmail(String email);

     String delete(Long id);
}
