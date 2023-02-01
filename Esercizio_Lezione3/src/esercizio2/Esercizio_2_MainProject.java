package esercizio2;

import java.util.Scanner;

public class Esercizio_2_MainProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisici un numero intero: ");
		int a = Integer.parseInt(sc.nextLine());

		switch (a) {
		case 0: {
			System.out.println("Numero zero");
			break;
		}
		case 1: {
			System.out.println("Numero uno");
			break;
		}
		case 2: {
			System.out.println("Numero due");
			break;
		}
		case 3: {
			System.out.println("Numero tre");
			break;
		}
		default:
			System.out.println("Errore!!!");
		}
	}

}
