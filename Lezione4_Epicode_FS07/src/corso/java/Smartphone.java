package corso.java;

public class Smartphone implements Navigatore {
	
	private String marca;
	private String modello;
	private int display;
	private int memoria;
	
	public Smartphone(String marca, String modello, int display, int memoria) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.display = display;
		this.memoria = memoria;
	}
	
	@Override
	public String accendi() {
		return "Navigatore Smartphone acceso";
	}

	@Override
	public String impostaMappa() {
		return "Mappa impostata su Navigatore Smartphone";
	}

	@Override
	public String avvia() {
		return "Avvia Navigatore Smartphone";
	}

	@Override
	public String aggiorna() {
		return "Navigatore Smartphone aggiornato";
	}
	
	

}
