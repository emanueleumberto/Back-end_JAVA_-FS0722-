package esercizio2;

public class ProjectMain {

	public static void main(String[] args) {
		
		CartaSIM sim1 = new CartaSIM("+39 123.456789");
		sim1.ricaricaSim(10);
		sim1.effettuaChiamata(3.1, "+39 987.123456");
		sim1.effettuaChiamata(1.5, "+39 456.987321");
		sim1.stampaDatiSIM();
		

	}

}
