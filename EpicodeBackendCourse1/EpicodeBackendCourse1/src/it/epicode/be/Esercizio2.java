package it.epicode.be;

public class Esercizio2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		String c = "MiaStringa";
		String[] d = new String[] {"uno", "due", "tre", "quattro", "cinque"}; 
		
		int resMoltiplica = moltiplica(a, b);
		System.out.println("Il risultato della moltiplicazione tra " + a + " e " + b + " è: " + resMoltiplica);
		
		String resConcatena = concatena(c, a);
		System.out.println("Il risultato della concatenazione tra " + c + " e " + a + " è: " + resConcatena);
		
		String[] newArray =inserisciInArray(d, c);
		System.out.println("Array: " );
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i] + " - " );
		}
		System.out.println();
		System.out.println("NewArray: ");
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i] + " - " );
		}

	}
	
	public static int moltiplica(int x, int y) {
		return x*y;
	}
	
	public static String concatena(String x, int y) {
		return "Str: " + x + " - Int: " + y; 
	}
	
	public static String[] inserisciInArray(String[] inputArr, String str) {
		String[] arr = new String[6];
		
		arr[0] = inputArr[0];
		arr[1] = inputArr[1];
		arr[2] = str;
		arr[3] = inputArr[2];
		arr[4] = inputArr[3];
		arr[5] = inputArr[4];
		
		return arr;
		
	}

}
