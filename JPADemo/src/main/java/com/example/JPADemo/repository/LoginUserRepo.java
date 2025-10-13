package com.example.JPADemo.repository;

import com.example.JPADemo.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserRepo extends JpaRepository<LoginUser, Integer> {

    // Check for login
    LoginUser findByUsernameAndPassword(String username, String password);


    LoginUser findByUsername(String username);
}
