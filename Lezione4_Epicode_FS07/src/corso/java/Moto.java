package corso.java;

public class Moto extends Veicolo implements Navigatore {
	
	private int posti;
	private int cilindrata;

	public Moto(String marca, String modello, int cilindrata, int posti) {
		super(marca, modello);
		this.posti = posti;
		this.cilindrata = cilindrata;
	}

	public int getPosti() {
		return posti;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	@Override
	public String acc() {
		return super.acc() + " con la manopola";
	}

	@Override
	public String frena() {
		return super.frena() + " con freno manubrio";
	}

	@Override
	public String toString() {
		return super.toString() + " Moto [posti=" + posti + ", cilindrata=" + cilindrata + "]";
	}

	@Override
	public String start() {
		return "Start Moto";
	}
	
	@Override
	public String accendi() {
		return "Navigatore Moto acceso";
	}

	@Override
	public String impostaMappa() {
		return "Mappa impostata su Navigatore Moto";
	}

	@Override
	public String avvia() {
		return "Avvia Navigatore Moto";
	}

	@Override
	public String aggiorna() {
		return "Navigatore Moto aggiornato";
	}
	
	

}
