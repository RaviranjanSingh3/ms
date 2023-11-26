package com.beta.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Controller
public class ShoppingController {

	@Autowired
	private RestTemplate rt;
	@LoadBalanced
	@Bean
	public RestTemplate rt() {
		
		return new RestTemplate();
	}
	
	@GetMapping("/amazon-service/{price}")
	public String invokePaymentService(@PathVariable("price") int price) {
		//traditional technique without eureka
		String url="http://localhost:7071/payment-provider/payNow/"+price;
	//by using eureka technique
	String mainUrl="http://payment-provider/payNow/"+price;
	System.out.println("hi ------");
	
	String s=rt.getForObject(url, String.class);
	System.out.println(s);
		return s;
	}
}
