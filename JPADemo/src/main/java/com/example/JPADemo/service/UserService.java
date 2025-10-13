package com.example.JPADemo.service;


import com.example.JPADemo.model.User;
import com.example.JPADemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    public   List<User> getAllUsers() {
        return repo.findAll();

    }

    public void adduser(User user) {
        repo.save(user);

    }
}
