package com.example.microserviceuserdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroServiceUserDataApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroServiceUserDataApplication.class, args);
	}
//
//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}


}
