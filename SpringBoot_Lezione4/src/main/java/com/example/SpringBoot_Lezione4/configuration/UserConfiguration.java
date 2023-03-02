package com.example.SpringBoot_Lezione4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.SpringBoot_Lezione4.model.User;

@Configuration
public class UserConfiguration {
	
	@Bean
	@Scope("prototype")
	public User testUser() {
		return new User("Mario", "Rossi", "Roma", 25, "m.rossi@example.com");
	}

}
