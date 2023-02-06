package esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1MainProject {
	
	static int[] array = new int[5];

	public static void main(String[] args) {
		
		creaNumeroCasuale();
		stampaArray();
		inserisciNumeroDaScanner();
		System.out.println("FINE");
		
	}
	
	public static void creaNumeroCasuale() {
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(11);
		}
	}
	
	public static void stampaArray() {
		System.out.println("Stampa Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void inserisciNumeroDaScanner() {
		Scanner sc = new Scanner(System.in);
		do {
			try {
			System.out.print("Inserisci il numero: ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.print("Inserisci posizione: ");
			int pos = Integer.parseInt(sc.nextLine());
			if(num == 0) {
				return;
			}
			array[pos] = num;
			stampaArray();
			}catch (NumberFormatException e) {
				System.out.println("Numero non valido!!!");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Indice Array non valido!!!");
			}
		}while(true);
	}

}
