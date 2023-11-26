package com.beta.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.beta.demo.client.ContactServiceClient;
import com.beta.demo.service.ConsumerService;

@RestController
public class ConsumerController {
	
	@Autowired
	private ContactServiceClient client;
	
	@Autowired
	private ConsumerService consumer;
	
	@GetMapping("/get/{id}")
	public String getUserById(@PathVariable Integer id) {
		
		System.out.println("hiii");
		return client.getUser(id);
	}
	
	
	
	@GetMapping("/info")
	public String getOrderStatus() {
	return consumer.getStatus();
	}

}
