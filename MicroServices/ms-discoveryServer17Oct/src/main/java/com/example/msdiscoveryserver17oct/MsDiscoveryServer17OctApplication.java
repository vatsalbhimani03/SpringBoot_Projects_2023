package com.example.msdiscoveryserver17oct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsDiscoveryServer17OctApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDiscoveryServer17OctApplication.class, args);
	}

}
