package com.beta.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
@SpringBootApplication
@RequestMapping("/show")
@EnableHystrix

public class S1BookMyShowApplication {

	@Autowired
	private RestTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(S1BookMyShowApplication.class, args);
	}

	@HystrixCommand(groupKey="java Tehie",commandKey="java techie", fallbackMethod="bookMyShow")
	@GetMapping("/bookNow")
	public String bookShow() {
	
		String emailRes=template.getForObject("http://localhost:8081/email/getEmail/",String.class);
		String payRes=template.getForObject("http://localhost:8082/payment/getPayment/",String.class);
	return emailRes+"----"+payRes;
	}
	
	@GetMapping("/bookNowWOH")
	public String bookShowWithoutHystrix() {
	
		String emailRes=template.getForObject("http://localhost:8081/email/getEmail/",String.class);
		String payRes=template.getForObject("http://localhost:8082/payment/getPayment/",String.class);
	return emailRes+"----"+payRes;
	}
	
	public String bookMyShow() {
		
		return "service gate Way failed";
	}
	@Bean
	public RestTemplate rt() {
		
		return new RestTemplate();
	}
}
