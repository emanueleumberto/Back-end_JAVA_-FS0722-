package com.example.SpringBoot_Lezione2.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.SpringBoot_Lezione2.classes.Box;

@Configuration
@PropertySource("classpath:application.properties")
public class BoxConfiguration {
	
	@Value("${box.x}") private int x;
	@Value("${box.y}") private int y;
	@Value("${box.name}") private String nome;
	
	
	// Recupero il Bean della classe Box
	@Bean
	public Box box() {
		return new Box(30, 10, "Box1");
	}
	
	// Recupero il Bean della classe Box
	@Bean
	public Box boxAppProp() {
		Box b = new Box();
		b.setX(x);
		b.setY(y);
		b.setName(nome);
		return b;
	}

	@Bean
	public Box boxBuilder() {
		return Box.builder()
					.name("Antonio Bianchi")
					.x(50)
					.y(10)
					.build();
	}
}
