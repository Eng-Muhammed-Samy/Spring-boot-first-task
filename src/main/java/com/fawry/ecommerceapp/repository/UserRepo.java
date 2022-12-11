package com.fawry.ecommerceapp.repository;

import com.fawry.ecommerceapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
