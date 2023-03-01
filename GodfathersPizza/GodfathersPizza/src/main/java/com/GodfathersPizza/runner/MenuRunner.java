package com.GodfathersPizza.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.GodfathersPizza.configuration.MenuConfiguration;
import com.GodfathersPizza.model.Menu;
import com.GodfathersPizza.model.Ordine;
import com.GodfathersPizza.model.Tavolo;

@Component
public class MenuRunner implements CommandLineRunner {
	
	Menu menu;
	AnnotationConfigApplicationContext appCtx;

	@Override
	public void run(String... args) throws Exception {
		gestioneMenu();
		
		//Tavolo t1 = new Tavolo(1, 4, false);
		//Tavolo t2 = new Tavolo(2, 6, false);
		//Tavolo t3 = new Tavolo(3, 2, false);
		
		Tavolo t = creaTavolo(1, 4);
		
		Ordine o1 = creaOrdine(t, 3);
		
		
	}
	
	// Gestione Menu
	
	public void gestioneMenu() {
		appCtx = new AnnotationConfigApplicationContext(MenuConfiguration.class);
	
		// Recupero Bean
		menu = (Menu) appCtx.getBean("menu");
		stampaMenu();
		
		appCtx.close();
	}
	
	public void stampaMenu() {
		System.out.println("********** Menu **********");
		System.out.println("Pizzas");
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuPizza()));
		
		System.out.println("Toppings");
		menu.getMenuTopping().forEach(t -> System.out.println(t.getMenuTopping()));
		
		System.out.println("Drinks");
		menu.getMenuDrink().forEach(d -> System.out.println(d.getMenuDrink()));
		
		System.out.println("Franchise");
		menu.getMenuBrand().forEach(a -> System.out.println(a.getMenuArticoloBrand()));
	}

	// Gestione Ordine
	
	
	public Tavolo creaTavolo(int numeroTavolo, int numeroMassimoCoperti) {
		appCtx = new AnnotationConfigApplicationContext(MenuConfiguration.class); 
		Tavolo t = (Tavolo) appCtx.getBean("tavolo", numeroTavolo, numeroMassimoCoperti); 
		appCtx.close();
		return t;
	}
	
	public Ordine creaOrdine(Tavolo tavolo, int numCoperti) { 
		  appCtx = new AnnotationConfigApplicationContext(MenuConfiguration.class); 
		  
		  Ordine o = (Ordine) appCtx.getBean("ordine"); 
		  o.setTavolo(tavolo);
		  o.setNumeroCoperti(numCoperti); 
		  
		  appCtx.close(); 
		  
		  return o; 
	}
	 

	public void stampaOrdine(Ordine o) {
		// Stampare
	}
	
	public void popolaOrdine(Ordine o) {
		// popola Ordine
		//o1.addProdotto(null)
	}

}
