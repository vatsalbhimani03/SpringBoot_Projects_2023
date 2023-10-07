//package com.example.microserviceuserdata.Api;
//
//import com.example.microserviceuserdata.Entity.UserOtherData;
//import com.example.microserviceuserdata.Repo.UserOtherDataRepo;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/user")
//public class UserAPI {
//
//    private final UserOtherDataRepo repo;
//    private final RestTemplate restTemplate;
//
////    private final WebClient webClient;
//
//    public UserAPI(UserOtherDataRepo repo, RestTemplate restTemplate) {
//        this.repo = repo;
//        this.restTemplate = restTemplate;
//    }
//
//    @GetMapping("/getUser/{userName}")
//    public ResponseEntity<?> getUser(@PathVariable String userName){
//        if(userName== null){
//            throw new RuntimeException();
//        }
//        Optional<UserOtherData> userOptional = repo.getUserByLogin(userName);
//        if (!userOptional.isPresent()) {
//            UserOtherData user = restTemplate.getForObject("http://localhost:8080/user/getUser/" + userName, UserOtherData.class);
//            if(user != null){
//                return ResponseEntity.status(200).body(repo.save(user));
//            }
//        }
//        return ResponseEntity.status(200).body(userOptional.get());
//
//    }
//
////    @GetMapping("/https://api.github.com/users/vatsalbhimani03")
////    public List<UserData> getUser(){
////        return repo.findAll();
////    }
//
//}
