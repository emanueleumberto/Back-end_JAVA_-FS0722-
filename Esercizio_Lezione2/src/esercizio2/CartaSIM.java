package esercizio2;

public class CartaSIM {
	
	String numeroTelefono;
	double creditoDisponibile;
	Chiamata[] chiamate;
	
	public CartaSIM(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.creditoDisponibile = 0;
		this.chiamate = new Chiamata[5];
	}
	
	public void ricaricaSim(double credito) {
		this.creditoDisponibile += credito;
	}
	
	public void effettuaChiamata(double durata, String numeroChiamato) {
		Chiamata c = new Chiamata(durata, numeroChiamato);
		if(this.creditoDisponibile > 0) {
			if(this.chiamate[0] == null)
				this.chiamate[0] = c;
			else if(this.chiamate[1] == null)
				this.chiamate[1] = c;
			else if(this.chiamate[2] == null)
				this.chiamate[2] = c;
			else if(this.chiamate[3] == null)
				this.chiamate[3] = c;
			else if(this.chiamate[4] == null)
				this.chiamate[4] = c;
		} else {
			System.out.println("Credito non disponibile");
		}
	}
	
	public void stampaDatiSIM() {
		System.out.println("Sim: " + this.numeroTelefono);
		System.out.println("Credito Disponibile: " + this.creditoDisponibile);
		this.stampaUltime5chiamate();
	}

	public void stampaUltime5chiamate() {
		if(this.chiamate[0] != null)
			System.out.println("- Chiamata 1: " + this.chiamate[0]);
		if(this.chiamate[1] != null)
			System.out.println("- Chiamata 2: " + this.chiamate[1]);
		if(this.chiamate[2] != null)
			System.out.println("- Chiamata 3: " + this.chiamate[2]);
		if(this.chiamate[3] != null)
			System.out.println("- Chiamata 4: " + this.chiamate[3]);
		if(this.chiamate[4] != null)
			System.out.println("- Chiamata 5: " + this.chiamate[4]);
	}
	
}
