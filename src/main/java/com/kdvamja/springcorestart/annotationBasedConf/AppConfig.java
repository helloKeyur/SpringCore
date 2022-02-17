package com.kdvamja.springcorestart.annotationBasedConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kdvamja.springcorestart.annotationBasedConf")
public class AppConfig {
	
	@Bean(name = {"getUser","user"})
	public User getUser() {
		return new User();
	}
}
