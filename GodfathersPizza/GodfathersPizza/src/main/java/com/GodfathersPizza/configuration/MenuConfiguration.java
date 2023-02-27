package com.GodfathersPizza.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.GodfathersPizza.model.Menu;

@Configuration
public class MenuConfiguration {

	@Bean
	public Menu menu() {
		Menu menu = new Menu();
		
		//Creare un Bean di tipo PizzaMargherita
		//Creare un Bean di tipo PizzaHawaiian
		//Creare un Bean di tipo PizzaSalami
		
		
		
		
		return menu;
	}
	
}
