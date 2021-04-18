package com.example.ticketapi.service;


import com.example.ticketapi.model.User;
import com.example.ticketapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(User user){
        userRepository.insert(user);
    }

    public void getUser(){

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
