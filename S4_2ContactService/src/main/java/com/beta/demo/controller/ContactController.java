package com.beta.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beta.demo.entity.Contact;
import com.beta.demo.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService service;
	@GetMapping("/user/{userId}")
	List<Contact> getContacts(@PathVariable("userId") long userId){
		
		return this.service.getContactByUser(userId);
	}
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/status")
	public String getOrderStatus() {
	return "FINISHED:\"Hello from Order Provider\":"+port;
	}
}
