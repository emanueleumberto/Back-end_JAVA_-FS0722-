package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		
		/*System.out.print("Inserire una prima stringa: ");
		arr[0] = sc.nextLine();
		
		System.out.print("Inserire una seconda stringa: ");
		arr[1] = sc.nextLine();
		
		System.out.print("Inserire una terza stringa: ");
		arr[2] = sc.nextLine();
		
		System.out.println("String in ordine: ");
		System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2]);
		
		System.out.println("String in ordine inverso: ");
		System.out.println(arr[2] + " - " + arr[1] + " - " + arr[0]);*/
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Inserire una stringa: ");
			arr[i] = sc.nextLine();
		}
		
		System.out.println("String in ordine: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " - ");
		}
		System.out.println();
		
		System.out.println("String in ordine inverso: ");
		for (int i = arr.length-1; i >= 0 ; i--) {
			System.out.print(arr[i] + " - ");
		}
	}

}
