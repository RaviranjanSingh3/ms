package com.beta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/payment")
public class S1PaytmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(S1PaytmServiceApplication.class, args);
	}

	@GetMapping("/getPayment")
	public String getPayment() {
		
		return "Payment procedd";
	}

}
