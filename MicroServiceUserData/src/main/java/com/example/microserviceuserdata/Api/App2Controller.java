package com.example.microserviceuserdata.Api;

//import com.example.microserviceuserdata.Entity.UserOtherData;
import com.example.microserviceuserdata.dto.UserOtherData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/app2")
public class App2Controller {

    @GetMapping("/user")
    public UserOtherData getUser(){
        WebClient webClient = WebClient.builder().build();
        UserOtherData user = webClient.get()
                .uri("http://localhost:8080/user/getUser/vatsalbhimani03")
                .retrieve()
                .bodyToMono(UserOtherData.class)
                .block();
        return user;
    }
}
