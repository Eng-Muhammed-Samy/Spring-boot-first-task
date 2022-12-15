package com.fawry.ecommerceapp.service;

import com.fawry.ecommerceapp.entity.NormalUser;

import java.util.List;

public interface UserService {

     NormalUser insert(NormalUser normalUser);

     List<NormalUser> findAllUsers();

     NormalUser findUserById(Long id);

     NormalUser update(NormalUser product);

     NormalUser finUserByEmail(String email);

     String delete(Long id);
}
