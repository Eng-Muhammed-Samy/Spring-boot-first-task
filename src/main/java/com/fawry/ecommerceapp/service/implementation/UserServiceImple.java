package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.User;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import com.fawry.ecommerceapp.repository.UserRepo;
import com.fawry.ecommerceapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImple implements UserService {

    private final UserRepo userRepo;

//    Logger log = LoggerFactory.getLogger(UserServiceImple.class);

    public User insert(User user){
        User getUserByEmail = finUserByEmail(user.getEmail());
        if (getUserByEmail != null){
            log.error("Duplicate user {}, this email already exist", user.getEmail());
            return user;
        }
        log.info("User with email {} created", user.getEmail());
        return userRepo.save(user);
    }

    public User update(User user){
        return userRepo.save(user);
    }

    @Override
    public User finUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public User findUserById(Long id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()){
            log.info("user email {} created at", user.get().getEmail());
            return user.get();
        }
        log.warn("User with user id {} is not found", id);
        throw new RecordNotFoundException("User Not Found");
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public String delete(Long id){
        userRepo.deleteById(id);
        log.info("user with id {} was deleted", id);
        return "deleted";
    }
}
