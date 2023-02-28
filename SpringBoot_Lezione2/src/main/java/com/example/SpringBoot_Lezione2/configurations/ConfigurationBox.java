package com.example.SpringBoot_Lezione2.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.SpringBoot_Lezione2.classes.Box;


@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationBox {
	
	@Value("${box.name}")
	private String name;
	
	@Bean
	public Box box() {
		return new Box(30, 10, "Box1");
	}
	
	@Bean
	public Box boxProp() {

		return new Box(40, 20, name);
	}

}
