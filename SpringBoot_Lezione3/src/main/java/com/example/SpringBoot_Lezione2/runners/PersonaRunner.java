package com.example.SpringBoot_Lezione2.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.SpringBoot_Lezione2.classes.Box;
import com.example.SpringBoot_Lezione2.classes.Persona;
import com.example.SpringBoot_Lezione2.configuration.BoxConfiguration;

@Component
public class PersonaRunner implements CommandLineRunner {
	
	AnnotationConfigApplicationContext appCtx;
	
	@Override
	public void run(String... args) throws Exception {
		appCtx = new AnnotationConfigApplicationContext(BoxConfiguration.class);
		
		// Recupero Bean
		Persona p = (Persona) appCtx.getBean("persona1");
		p.getMateriePreferite().add("Java");
		
		appCtx.close();
	}

}
