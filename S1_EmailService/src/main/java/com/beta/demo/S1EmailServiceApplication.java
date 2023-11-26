package com.beta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/email")
public class S1EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(S1EmailServiceApplication.class, args);
	}
	
	@GetMapping("/getEmail")
	public String getEMail() {
		
		return "email is called";
	}

}
