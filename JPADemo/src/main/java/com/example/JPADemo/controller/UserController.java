package com.example.JPADemo.controller;

import com.example.JPADemo.model.User;
import com.example.JPADemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/users")

    public String adduser(@RequestBody User user){
        service.adduser(user);
        return "Submitted Successfully!!!";
    }
}

