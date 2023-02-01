package esercizio4;

import java.util.Scanner;

public class Esercizio_4_MainProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisici un numero intero: ");
		int a = Integer.parseInt(sc.nextLine());

		for(int i=a; i>=0; i--) {
			System.out.println(i);
		}
	}

}
