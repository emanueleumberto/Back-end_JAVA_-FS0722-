package esercizio2;

public class Chiamata {
	
	double durata;
	String numeroChiamato;
	
	public Chiamata(double durata, String numeroChiamato) {
		this.durata = durata;
		this.numeroChiamato = numeroChiamato;
	}

	@Override
	public String toString() {
		return "Chiamata [durata=" + durata + ", numeroChiamato=" + numeroChiamato + "]";
	}

}
