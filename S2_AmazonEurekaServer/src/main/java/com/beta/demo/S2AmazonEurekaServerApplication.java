package com.beta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S2AmazonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S2AmazonEurekaServerApplication.class, args);
	}

}
