package com.example.springjava23.restController;

import com.example.springjava23.dto.User;
import com.example.springjava23.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //@Autowired- Automatically Setter based dependency injection
    @Autowired
    UserRepo userRepo;

//    // constructor based setter dependency injection
//    UserRepo userRepo;
//    public UserController(UserRepo userRepo){
//        this.userRepo = userRepo;
//    }

    @GetMapping("/1")
    public User getUser1(){
        User user = User.builder().firstName("Vatsal").lastName("Bhimani").age(23).build();
        // Spring provides JSON parsing by default.
        return user;
    }
    @GetMapping("/2")
    public User getUser2(){
        User user = User.builder().firstName("Sachin").lastName("Patel").age(23).build();
        return user;
    }
    @GetMapping("/3")
    public User getUser3(){
        User user = User.builder().firstName("Milan").lastName("Donga").age(23).build();
        return user;
    }
    @GetMapping("/4")
    public User getUser4(){
        User user = User.builder().firstName("Samay").lastName("Mangukiya").age(23).build();
        return user;
    }

    // PostMapping - we need data from HTTP body
    @PostMapping("/add")
    public List<User> insertUser(@RequestBody User user){
        return userRepo.addUser(user);
//        System.out.println("User Inserted: "+ user);
//        return "User Inserted Successfully";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userRepo.getAllUser();
    }
}
