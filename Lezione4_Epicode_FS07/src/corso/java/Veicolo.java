package corso.java;

public abstract class Veicolo {
	
	private String marca;
	private String modello;
	
	public Veicolo(String marca, String modello) {
		this.marca = marca;
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}
	
	public String acc() {
		return "aumenta con moderazione velocità";
	}
	
	public String frena() {
		return "diminuisci velocità";
	}
	
	public abstract String start();

	@Override
	public String toString() {
		return "Veicolo [marca=" + marca + ", modello=" + modello + "]";
	}
	
	
}
