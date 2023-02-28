package com.example.SpringBoot_Lezione2.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.SpringBoot_Lezione2.classes.Box;


@Configuration
public class ConfigurationBox {
	
	@Bean
	public Box box() {
		return new Box(30, 10, "Box1");
	}
	
	@Bean
	public Box boxProp() {
		return new Box(40, 20);
	}

}
