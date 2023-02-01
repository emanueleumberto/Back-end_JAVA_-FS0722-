package corso.java;

import java.util.Scanner;

import oop.java.Veicolo;

public class MainProject {
	
	static Scanner sc = new Scanner(System.in);
	static Persona[] spettatori = new Persona[50];

	public static void main(String[] args) {
	

		int i = 1;
		while(true) {
			System.out.print("Cosa vuoi fare?");
			String r = sc.nextLine();
			
			switch (r) {
				case "biglietto": {
					registrazione();
					break;
				}
				case "stampa": {
					stampaBiglietti();
					break;
				}
				case "esci": {
					System.out.println("FINE");
					return;
				}
				default:
					System.out.println("Scelta non valida... (biglietto-stampa-esci)");
					break;
			}
		}
		
	}
	
	public static void registrazione() {
		
		System.out.print("Inserisci il nome: ");
		String nome = sc.nextLine();
		System.out.print("Inserisci il cognome: ");
		String cognome = sc.nextLine();
		System.out.print("Inserisci la tua età: ");
		int eta = Integer.parseInt(sc.nextLine());
		
		if(eta > 18) {
			System.out.println("Ciao " + nome + " " + cognome);
			emettiBiglietto(new Persona(nome, cognome, eta));
		} else if(eta > 16) {
			System.out.println("Ciao " + nome + " " + cognome + " devi essere accompagnato");
		} else {
			System.out.println("Non puoi entrare!!!");
		}
	}
	
	public static void emettiBiglietto(Persona p) {
		/*if(spettatori[0] == null)
			spettatori[0] = p;
		else if(spettatori[1] == null)
			spettatori[1] = p;*/
		for(int i=0; i<spettatori.length; i++) {
			if(spettatori[i] == null) {
				spettatori[i] = p;
				break;
			}
		}
	}

	public static void stampaBiglietti() {
		System.out.println("Elenco biglietti");
		for(int i=0; i<spettatori.length; i++) {
			if(spettatori[i] != null)
			System.out.println(spettatori[i]);
		}
	}
}
