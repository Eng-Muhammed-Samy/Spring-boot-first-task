package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.User;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import com.fawry.ecommerceapp.repository.UserRepo;
import com.fawry.ecommerceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserRepo userRepo;

    public User insert(User user){
        return userRepo.save(user);
    }

    public User update(User user){
        return userRepo.save(user);
    }

    public User findUserById(Long id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()){
            return user.get();
        }
        throw new RecordNotFoundException("User Not Found");
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public String delete(Long id){
        userRepo.deleteById(id);
        return "deleted";
    }
}
