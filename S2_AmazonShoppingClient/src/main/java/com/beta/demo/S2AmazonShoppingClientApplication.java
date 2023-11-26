package com.beta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class S2AmazonShoppingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(S2AmazonShoppingClientApplication.class, args);
		System.out.println("runs");
	}

}
