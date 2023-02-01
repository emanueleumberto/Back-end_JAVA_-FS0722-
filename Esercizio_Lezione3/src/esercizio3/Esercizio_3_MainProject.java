package esercizio3;

import java.util.Scanner;

public class Esercizio_3_MainProject {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Inserisici una stringa: ");
			String s = sc.nextLine();
			
			if(s.equals(":q")) {
				System.out.print("Fine");
				return;
			}
			
			String[] arrStr = s.split("");
			
			String sVirgola = String.join(",", arrStr);
			/*
			String sVirgola = "";
			for(int i=0; i<arrStr.length; i++) {
				if(i ==  arrStr.length-1)
					sVirgola += arrStr[i];
				else
					sVirgola += arrStr[i] + ",";
			}*/
			
			System.out.println(sVirgola);
		}

	}

}
