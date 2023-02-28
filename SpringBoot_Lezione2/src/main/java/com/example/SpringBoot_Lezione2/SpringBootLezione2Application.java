package com.example.SpringBoot_Lezione2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.SpringBoot_Lezione2.classes.Box;
import com.example.SpringBoot_Lezione2.configurations.ConfigurationBox;

@SpringBootApplication
public class SpringBootLezione2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLezione2Application.class, args);
	
		getAppBeanBox();
	}
	
	public static void getAppBeanBox() {
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationBox.class);
		
		// Recupero Bean
		//Box b1 = (Box) appCtx.getBean("box");
		//System.out.println("Box: " + b1.getName() + " Area: " + b1.getArea() + " Perimetro: " + b1.getPerimeter());
		
		// Recupero Bean
		Box b2 = (Box) appCtx.getBean("boxProp");
		System.out.println("Box: " + b2.getName() + " Area: " + b2.getArea() + " Perimetro: " + b2.getPerimeter());
		
		
		appCtx.close();
	}

}
