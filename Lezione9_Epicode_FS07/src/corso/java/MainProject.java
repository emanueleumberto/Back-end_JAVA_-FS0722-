package corso.java;

import java.util.ArrayList;
import java.util.List;

public class MainProject {
	
	static List<String> lista = new ArrayList<String>();

	public static void main(String[] args) {
		
		lista.add("Prima");
		lista.add("Seconda");
		lista.add("Terza");
		
		stampaLista();
		
		//()-> System.out.println("Lambda Function");
		//(String s)-> System.out.println("Lambda Function " + s);
		//String s -> System.out.println("Lambda Function " + s);
		
		//Soluzione 1
		//ClasseConcreta c = new ClasseConcreta();
		//stampaMessaggio(c);
		
		//Soluzione 2
		//stampaMessaggio(new ClasseConcreta());
		
		//Soluzione 3
		stampaMessaggio(new IMessage() {
						
			@Override
			public String getMessage() {
				return "ClasseAnonima message";
			}

		});
		
		stampaMessaggio(() -> "ClasseAnonima message");
		
		
		MioThred mt = new MioThred();
		
		Thread t1 = new Thread(mt);
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		});
		
		Thread t3 = new Thread(()-> {
								for (int i = 0; i < 10; i++) {
									System.out.println(i);
								}
					});
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	public static void stampaMessaggio(IMessage m) {
		System.out.println(m.getMessage());
	}
	
	public static void stampaLista() {
		lista.forEach((ele) -> System.out.println(ele));
		
		for (String ele : lista) {
			System.out.println(ele);
		}
	}

}
