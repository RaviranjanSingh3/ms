package com.beta.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.beta.demo.client.ContactServiceClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class S41FiegnClientApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(S41FiegnClientApplication.class, args);
	}
	
	

}
