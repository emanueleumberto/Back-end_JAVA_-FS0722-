package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import esercizio1.Esercizio1MainProject;

public class Esercizio3MainProject {
	
	private static Map<String, String> rubrica = new HashMap<String, String>();
	private static Scanner sc = new Scanner(System.in);
	private static Logger log = LoggerFactory.getLogger(Esercizio1MainProject.class);
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.print("Aggiungi contatto (si/no)");
			String scelta = sc.nextLine();
			if(scelta.equals("no")) {
				break;
			}
			System.out.print("Nome Contatto: ");
			String nome = sc.nextLine();
			System.out.print("Numero Contatto: ");
			String numero = sc.nextLine();
			try {
				aggiungiContatto(nome, numero);
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
		
		stampaContatti();
		
		System.out.print("Rimuovi contatto da nome (si/no)");
		String scelta = sc.nextLine();
		if(scelta.equals("si")) {
			System.out.print("Dimmi il nome del contatto");
			String nomeContatto = sc.nextLine();
			try {
				rimuoviContatto(nomeContatto);
			} catch (Exception e) {
				log.error(e.getMessage());
			}
			stampaContatti();
		}
		
		System.out.print("Cerca contatto da numero (si/no)");
		scelta = sc.nextLine();
		if(scelta.equals("si")) {
			System.out.print("Dimmi il numero del contatto");
			String numeroContatto = sc.nextLine();
			 String contatto = ricercaContatto(numeroContatto);
			 System.out.println("Contatto cercato: " + contatto);
		}
		
		System.out.print("Cerca contatto da nome (si/no)");
		scelta = sc.nextLine();
		if(scelta.equals("si")) {
			System.out.print("Dimmi il nome del contatto");
			String nomeContatto = sc.nextLine();
			String contatto = ricercaNumero(nomeContatto);
			System.out.println("Contatto cercato: " + contatto);
		}
	}
	
	private static void aggiungiContatto(String nome, String telefono) throws Exception {
		if(rubrica.containsKey(nome)) {
			throw new Exception("Contatto già presente in rubrica!!!!");
		} else {
			rubrica.put(nome, telefono);
		}
	}
	
	private static void rimuoviContatto(String nome) throws Exception {
		if(rubrica.containsKey(nome)) {
			rubrica.remove(nome);
		} else {
			throw new Exception("Contatto NON presente in rubrica!!!!");
		}
	}
	
	private static String ricercaContatto(String numero) {
		Set<String> listaKey = rubrica.keySet();
		String contattoTrovato = null;
		for (String key : listaKey) {
			String numeroContatto = rubrica.get(key);
			if(numero.equals(numeroContatto)) {
				contattoTrovato = key;
				break;
			}
		}
		return contattoTrovato;
	}
	
	private static String ricercaNumero(String nome) {
		return rubrica.get(nome);
	}
	
	private static void stampaContatti() {
		System.out.println("*** Rubrica ***");
		for (String key : rubrica.keySet()) {
			System.out.println("Nome: " + key + " tel. " + rubrica.get(key));
		}
	}

}
