package com.example.githubuserdata.Api;

import com.example.githubuserdata.Entity.UserData;
import com.example.githubuserdata.Repo.UserDataRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserAPI {

    private final UserDataRepo repo;
    private final RestTemplate restTemplate;

//    private final WebClient webClient;

    public UserAPI(UserDataRepo repo, RestTemplate restTemplate) {
        this.repo = repo;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getUser/{userName}")
    public ResponseEntity<?> getUser(@PathVariable String userName){
        if(userName== null){
            throw new RuntimeException();
        }
        Optional<UserData> userOptional = repo.getUserByLogin(userName);
        if (!userOptional.isPresent()) {
            UserData user = restTemplate.getForObject("https://api.github.com/users/" + userName, UserData.class);
            if(user != null){
                return ResponseEntity.status(200).body(repo.save(user));
            }
        }
        return ResponseEntity.status(200).body(userOptional.get());

    }

//    @GetMapping("/https://api.github.com/users/vatsalbhimani03")
//    public List<UserData> getUser(){
//        return repo.findAll();
//    }

}
