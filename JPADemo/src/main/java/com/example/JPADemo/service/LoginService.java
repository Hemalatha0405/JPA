package com.example.JPADemo.service;

import com.example.JPADemo.model.LoginUser;
import com.example.JPADemo.repository.LoginUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginUserRepo repo;

    // Login validation
    public boolean validateUser(String username, String password) {
        return repo.findByUsernameAndPassword(username, password) != null;
    }

    // Get all users
    public List<LoginUser> getAllLoginUsers() {
        return repo.findAll();
    }

    // Register new user
    public String addLoginUser(LoginUser user) {
        if (repo.findByUsername(user.getUsername()) != null) {
            return "Username already exists!";
        }
        repo.save(user);
        return "User Registered Successfully!";
    }
}
