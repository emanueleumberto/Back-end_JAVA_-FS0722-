package esercizio1;

public class MainProjectEsercizio1 {

	public static void main(String[] args) {

		Rettangolo r1 = new Rettangolo(10, 5);
		Rettangolo r2 = new Rettangolo(20, 10);
		stampaRettangolo(r1);
		stampaDueRettangoli(r1, r2);

	}
	
	public static void stampaRettangolo(Rettangolo r) {
		System.out.println("Perimetro: " + r.perimetro());
		System.out.println("Area: " + r.area());
	}
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		/*System.out.println("Perimetro: " + r1.perimetro());
		System.out.println("Area: " + r1.area());*/
		stampaRettangolo(r1);
		/*System.out.println("Perimetro: " + r2.perimetro());
		System.out.println("Area: " + r2.area());*/
		stampaRettangolo(r2);
		System.out.println("Somma Perimetro: " + (r1.perimetro()+r2.perimetro()));
		System.out.println("Somma Area: " + (r1.area()+r2.area()));
	}

}
