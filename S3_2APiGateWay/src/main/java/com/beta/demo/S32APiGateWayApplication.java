package com.beta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class S32APiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(S32APiGateWayApplication.class, args);
	}

}
