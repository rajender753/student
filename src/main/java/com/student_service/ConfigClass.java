package com.student_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigClass {
	
	@Bean
	public WebClient.Builder webClientBuilder() {
	    return WebClient.builder();
	}

}
