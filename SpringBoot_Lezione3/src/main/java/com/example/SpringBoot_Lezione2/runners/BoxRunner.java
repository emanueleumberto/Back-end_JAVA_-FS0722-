package com.example.SpringBoot_Lezione2.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.SpringBoot_Lezione2.classes.Box;
import com.example.SpringBoot_Lezione2.configuration.BoxConfiguration;


@Component
public class BoxRunner implements CommandLineRunner {

	AnnotationConfigApplicationContext appCtx;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run...");
		
		appCtx = new AnnotationConfigApplicationContext(BoxConfiguration.class);
		
		// Recupero Bean
		Box b1 = (Box) appCtx.getBean("box");
		//System.out.println("Box: " + b1.getName() + " Area: " + b1.getArea() + " Perimetro: " + b1.getPerimeter());
		
		appCtx.close();
	}

}
