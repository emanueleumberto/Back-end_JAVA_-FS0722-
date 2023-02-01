package esercizio1;

import java.util.Scanner;

public class Esercizio_1_MainProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisici una stringa: ");
		String s = sc.nextLine();
		boolean b = stringaPariDispari(s);
		if(b) {
			System.out.println("Il numero di caratteri della stringa "+s+" è pari ");
		} else {
			System.out.println("Il numero di caratteri della stringa "+s+" è dispari ");
		}
		
		System.out.print("Inserisici un anno: ");
		int a = Integer.parseInt(sc.nextLine());
		
		boolean annob = annoBisestile(a);
		if(annob) {
			System.out.println("L'anno "+a+" è bisestile ");
		} else {
			System.out.println("L'anno "+a+" non è bisestile ");
		}
	}

	public static boolean stringaPariDispari(String s) {
		boolean b = s.length() % 2 == 0;
		return b;
	}
	
	public static boolean annoBisestile(int anno) {
		if(anno % 4 == 0) {
			return true;
		} else if(anno % 100 == 0 && anno % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
