package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.Product;
import com.fawry.ecommerceapp.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

     User insert(User user);

     List<User> findAllUsers();

     Optional<User> findUserById(Long id);

     User update(User product);

     String delete(Long id);
}
