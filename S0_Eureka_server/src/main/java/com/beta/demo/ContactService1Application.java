package com.beta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ContactService1Application {

	public static void main(String[] args) {
		SpringApplication.run(ContactService1Application.class, args);
	}

}
