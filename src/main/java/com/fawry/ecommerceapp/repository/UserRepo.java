package com.fawry.ecommerceapp.repository;

import com.fawry.ecommerceapp.entity.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<NormalUser, Long> {

    NormalUser findByEmail(String email);

}
