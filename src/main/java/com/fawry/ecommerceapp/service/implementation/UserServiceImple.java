package com.fawry.ecommerceapp.service.implementation;

import com.fawry.ecommerceapp.entity.NormalUser;
import com.fawry.ecommerceapp.error.exceptions.RecordNotFoundException;
import com.fawry.ecommerceapp.error.exceptions.UserNotFoundException;
import com.fawry.ecommerceapp.repository.UserRepo;
import com.fawry.ecommerceapp.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImple implements UserService {

    private final UserRepo userRepo;

//    Logger log = LoggerFactory.getLogger(UserServiceImple.class);

    public NormalUser insert(NormalUser normalUser){
        NormalUser getNormalUserByEmail = finUserByEmail(normalUser.getEmail());
        if (getNormalUserByEmail != null){
            log.error("Duplicate user {}, this email already exist", normalUser.getEmail());
            return normalUser;
        }
        log.info("User with email {} created", normalUser.getEmail());
        return userRepo.save(normalUser);
    }

    public NormalUser update(NormalUser normalUser){
        return userRepo.save(normalUser);
    }

    @Override
    public NormalUser finUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public NormalUser findUserById(Long id) {
        Optional<NormalUser> user = userRepo.findById(id);
        if (user.isPresent()){
            log.info("user email {} created at", user.get().getEmail());
            return user.get();
        }
        log.warn("User with user id {} is not found", id);
        throw new RecordNotFoundException("User Not Found");
    }

    public List<NormalUser> findAllUsers(){
        return userRepo.findAll();
    }

    public String delete(Long id){
        userRepo.deleteById(id);
        log.info("user with id {} was deleted", id);

         return "deleted";
}


}
