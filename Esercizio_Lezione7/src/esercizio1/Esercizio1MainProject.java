package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio1MainProject {
	
	private static Logger log = LoggerFactory.getLogger(Esercizio1MainProject.class);
	private static Scanner sc = new Scanner(System.in);
	private static Set<String> parole = new HashSet<String>();
	private static Set<String> paroleDuplicate = new HashSet<String>();
	
	public static void main(String[] args) {
		
		System.out.print("inserire un intero N: ");
		int n = Integer.parseInt(sc.nextLine());
		
		if(n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print("inserire una parola: ");
				String parola = sc.nextLine();
				boolean agg = parole.add(parola);
				
				if(!agg) {
					paroleDuplicate.add(parola);
					//log.info("Parola duplicata: " + agg);
				}
			}
			
			log.info("N. Parole: " + parole.size());
			log.info("Elenco Parole: ");
			for (String p : parole) {
				log.info("   - " + p);
			}
			
			log.info("Elenco Parole duplicate: ");
			for (String p : paroleDuplicate) {
				log.info("   - " + p);
			}
		}

	}

}
