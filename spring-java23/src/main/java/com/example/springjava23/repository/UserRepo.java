package com.example.springjava23.repository;

import com.example.springjava23.dto.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component generate bean
@Component
public class UserRepo {
    List<User> users = new ArrayList<>();

    public List<User> addUser(User user){
        users.add(user);
        return users;
    }

    public List<User> getAllUser(){
        return users;
    }
}
