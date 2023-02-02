package corso.java;

public class Automobile extends Veicolo implements Navigatore {

	private int porte;

	public Automobile(String marca, String modello, int porte) {
		super(marca, modello);
		this.porte = porte;
	}

	public int getPorte() {
		return porte;
	}
	
	@Override
	public String acc() {
		return super.acc() +  " con il pedale";
	}

	@Override
	public String frena() {
		return super.frena() + " con freno pedale";
	}

	@Override
	public String toString() {
		return super.toString() + " Automobile [porte=" + porte + "]";
	}

	@Override
	public String start() {
		return "Start Automobile";
	}
	
	@Override
	public String accendi() {
		return "Navigatore Automobile acceso";
	}

	@Override
	public String impostaMappa() {
		return "Mappa impostata su Navigatore Automobile";
	}

	@Override
	public String avvia() {
		return "Avvia Navigatore Automobile";
	}

	@Override
	public String aggiorna() {
		return "Navigatore Automobile aggiornato";
	}

	
	
	
	
}
