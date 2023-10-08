package com.propertytax.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyAppConfiguration {
	
	@Bean
	public Customer customer() {
		return new Customer();
	}

}
