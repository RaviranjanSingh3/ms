package com.beta.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.beta.demo.entity.User;
import com.beta.demo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@EnableHystrix
@RestController
@RequestMapping("/user")


public class UserController {
	
	@Autowired
	private UserService service;
	@Autowired
	private RestTemplate rt;
	
	//@HystrixCommand( fallbackMethod="http://api-gateway//userServiceFallback")
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId")int id ) {
		// here url is hard coated
		User user= this.service.getUser(id);
	   //http://localhost:9091/contact/user/1
		
		List l=this.rt.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);
		System.out.println(l);
		user.setContacts(l);
		System.out.println(user.toString());
		return user;
	}

}
