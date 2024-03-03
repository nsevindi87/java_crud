package com.javaCodePractice.crud_dashboard.controller;

import com.javaCodePractice.crud_dashboard.entity.User;
import com.javaCodePractice.crud_dashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return  userService.postUser(user);
    }
}
