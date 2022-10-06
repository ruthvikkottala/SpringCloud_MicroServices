package com.demo.spring.cloud.provider.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderApplication {

	@GetMapping("/getPlans")
	public List<String> getPlans(){
		return Arrays.asList("Plan 1","Plan 2","Plan 3","Plan 4");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(InsuranceProviderApplication.class, args);
	}

}
