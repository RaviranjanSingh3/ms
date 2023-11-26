package com.beta.demo.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="contact-service")
@RibbonClient(name="contact-service")
public interface ContactServiceClient {

	@GetMapping("/contact/user/{id}")
	
	public String getUser(@PathVariable int id);
}
