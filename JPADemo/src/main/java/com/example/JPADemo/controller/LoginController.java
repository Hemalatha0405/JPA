package com.example.JPADemo.controller;

import com.example.JPADemo.model.LoginUser;
import com.example.JPADemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService service;


    @GetMapping("/users")
    public List<LoginUser> getAllLoginUsers() {

        return service.getAllLoginUsers();
    }


    @PostMapping
    public String loginUser(@RequestBody LoginUser loginUser) {
        boolean isValid = service.validateUser(loginUser.getUsername(), loginUser.getPassword());
        if (isValid) return "Login Successful!";
        else return "Invalid username or password!";
    }


    @PostMapping("/register")
    public String registerUser(@RequestBody LoginUser loginUser) {
        return service.addLoginUser(loginUser);
    }
}

