package com.example.payment.zipkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class PaymentServiceApplication {

	@Autowired
	private RestTemplate template;

	private static final Logger log = LoggerFactory.getLogger(PaymentServiceApplication.class);

	@GetMapping("/getDiscount")
	public String getDiscount() {
		log.info("Dicount service called");
		return "Applied 15% discount";
	}

	@GetMapping("/payment")
	public String getPayment() {
		return template.getForObject("http://localhost:8080/getDiscount", String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
