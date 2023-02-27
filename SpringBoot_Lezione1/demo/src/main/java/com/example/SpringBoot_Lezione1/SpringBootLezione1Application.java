package com.example.SpringBoot_Lezione1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config_bean_XML.TestXml;
import config_bean_component.TestComponent;
import config_bean_configuration.ConfigurationTest;
import config_bean_configuration.Test;

@SpringBootApplication
public class SpringBootLezione1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLezione1Application.class, args);
	
		//configWith_Beans();
		//configWith_XML();
		configWith_Components();
	}
	
	public static void configWith_Beans() {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(ConfigurationTest.class);
		
		// Recupero Bean
		Test t1 = (Test) appCtx.getBean("test");
		
		
		// Recupero Bean con parametri
		Test t2 = (Test) appCtx.getBean("test2", "Giuseppe", "Verdi");
		
		System.out.println(t1.saluta());
		System.out.println(t2.saluta());
		
		((AnnotationConfigApplicationContext) appCtx).close();

	}
	
	public static void configWith_XML() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");
		
		// Recupero Bean
		TestXml t1 = (TestXml) appCtx.getBean("TestXml");
		System.out.println(t1.saluta());
		
		((ClassPathXmlApplicationContext) appCtx).close();
	}
	
	public static void configWith_Components() {
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext();
		
		appCtx.scan("config_bean_component");
		appCtx.refresh();
		
		// Recupero Bean
		TestComponent t1 = (TestComponent) appCtx.getBean("TestComponent", "Giuseppe", "Verdi");
		System.out.println(t1.saluta());
		
		TestComponent t2 = (TestComponent) appCtx.getBean("TestComponent", "Giuseppe");
		System.out.println(t2.saluta());
		
		appCtx.close();
	}

}
