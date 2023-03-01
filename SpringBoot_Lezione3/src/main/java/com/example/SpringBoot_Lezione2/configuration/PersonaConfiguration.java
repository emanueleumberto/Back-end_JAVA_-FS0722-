package com.example.SpringBoot_Lezione2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.SpringBoot_Lezione2.classes.Address;
import com.example.SpringBoot_Lezione2.classes.Box;
import com.example.SpringBoot_Lezione2.classes.Persona;
import com.example.SpringBoot_Lezione2.classes.Phone;

@Configuration
public class PersonaConfiguration {
	
	
	@Bean
	public Phone phone() {
		return new Phone("+39 123 4567890");
	}
	
	@Bean
	public Address address() {
		return new Address("Via abc 15");
	}
	
	@Bean
	@Scope("prototype")
	public Persona persona1() {
		return new Persona("Mario Rossi", phone(), address());
	}
	
	@Bean
	@Scope("singleton")
	public Persona persona2() {
		Persona p = new Persona();
		p.setFullName("Giuseppe Verdi");
		p.setPhone(phone());
		p.setAddress(address());
		return p;
	}

}
