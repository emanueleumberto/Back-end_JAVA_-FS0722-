package corso.java;

import java.util.ArrayList;
import java.util.List;

public class MainProject {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("Iphone", "+39 123.4567890");
		Telefono t2 = new Telefono("Samsung", "+39 333.6655789");
		Telefono t3 = new Telefono("Abc", "+39 444.9876543210");
		
		Persona p1 = new Persona("Mario Rossi", t1);
		Persona p2 = new Persona("Giuseppe Verdi");
		p2.setTelefono(t2);
		Persona p3 = new Persona("Antonio Neri");
		p3.telefono = t3;
		
		p1.telefono.avviaNavigatore();
		
		
		List<Navigatore> nav = new ArrayList<Navigatore>();
		
		nav.add(t1);
		
		
		//SingletonTest st1 = new SingletonTest();
		SingletonTest st1 = SingletonTest.getInstance();
		System.out.println(st1);
		//SingletonTest st2 = new SingletonTest();
		SingletonTest st2 = SingletonTest.getInstance();
		System.out.println(st2);

	}

}
