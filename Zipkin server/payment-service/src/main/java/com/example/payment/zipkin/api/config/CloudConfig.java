package com.example.payment.zipkin.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;


@Configuration
public class CloudConfig {

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@Bean
    public Sampler alwaysSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
	
}
