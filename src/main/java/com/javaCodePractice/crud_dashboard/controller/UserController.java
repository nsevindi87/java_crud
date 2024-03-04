package com.javaCodePractice.crud_dashboard.controller;

import com.javaCodePractice.crud_dashboard.entity.User;
import com.javaCodePractice.crud_dashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;
    private String id;

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return  userService.postUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
