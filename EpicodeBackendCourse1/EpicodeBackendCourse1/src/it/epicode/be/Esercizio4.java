package it.epicode.be;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci i lati di un rettangolo:");
		System.out.print("Inserisci lato 1: ");
		double l1 = Double.parseDouble(sc.nextLine());
		System.out.print("Inserisci lato 2: ");
		double l2 = Double.parseDouble(sc.nextLine());

		double pr = perimetroRettangolo(l1, l2);
		System.out.println("Il perimetro di un rettangolo è: " + pr);
		
		System.out.print("Inserisci un numero intero: ");
		int num = Integer.parseInt(sc.nextLine());
		
		int pd = pariDispari(num);
		if(pd == 0) {
			System.out.println("Il numero inserito è pari!!" );
		} else {
			System.out.println("Il numero inserito è dispari!!" );
		}
		
		
		System.out.println("Inserisci i lati di un trinagolo:");
		System.out.print("Inserisci lato 1: ");
		double t1 = Double.parseDouble(sc.nextLine());
		System.out.print("Inserisci lato 2: ");
		double t2 = Double.parseDouble(sc.nextLine());
		System.out.print("Inserisci lato 3: ");
		double t3 = Double.parseDouble(sc.nextLine());
		
		double pt = perimetroTriangolo(t1, t2, t3);
		System.out.println("Il perimetro di un triangolo è: " + pt);
		
		System.out.println("FINE");
	}
	
	public static double perimetroRettangolo(double l1, double l2) {
		return l1*2+l2*2;
	}
	
	public static int pariDispari(int n) {
		return (n%2);
	}
	
	public static double perimetroTriangolo(double l1, double l2, double l3) {
		
		double sp = (l1+l2+l3)/2; // semiperimetro
		
		double r = sp*(sp-l1)*(sp-l2)*(sp-l3);
		
		return Math.sqrt(r);
		
	}

}
