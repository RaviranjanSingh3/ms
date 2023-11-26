package com.beta.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userService() {
		
		return "user service is down at this time";
	}

	@GetMapping("/contactServiceFallback")
	public String contactService() {
		
		return "contact service is down at this time";
	}

}
