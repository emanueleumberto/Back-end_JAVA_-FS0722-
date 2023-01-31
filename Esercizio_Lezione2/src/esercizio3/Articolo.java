package esercizio3;

public class Articolo {
	String codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int numeroPezziDisponibili;
	static int numeroPezziDisponibiliMagazzino = 0;
	
	public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo,
			int numeroPezzi) {
		this.codiceArticolo = codiceArticolo;
		this.descrizioneArticolo = descrizioneArticolo;
		this.prezzo = prezzo;
		this.numeroPezziDisponibili = numeroPezzi;
		numeroPezziDisponibiliMagazzino += numeroPezzi;
	}

	public static int numeroPezziTotali() {
		return numeroPezziDisponibiliMagazzino;
	}

	@Override
	public String toString() {
		return "Articolo [codiceArticolo=" + codiceArticolo + ", descrizioneArticolo=" + descrizioneArticolo
				+ ", prezzo=" + prezzo + ", numeroPezziDisponibili=" + numeroPezziDisponibili + "]";
	}
	
	
}
