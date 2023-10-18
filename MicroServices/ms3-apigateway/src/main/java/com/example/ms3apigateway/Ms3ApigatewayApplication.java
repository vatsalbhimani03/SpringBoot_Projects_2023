package com.example.ms3apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Ms3ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms3ApigatewayApplication.class, args);
	}

}
