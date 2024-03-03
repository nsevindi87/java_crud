package com.javaCodePractice.crud_dashboard.service;

import com.javaCodePractice.crud_dashboard.entity.User;
import com.javaCodePractice.crud_dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User postUser( User user){
        return userRepository.save(user);
    }
}
