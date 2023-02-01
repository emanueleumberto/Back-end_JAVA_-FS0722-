package oop.java;

public class Veicolo {
	// public private protected package
	private String modello;
	private String marca;
	private String targa;
	private String colore;
	
	public Veicolo(String modello, String marca, String targa, String colore) {
		this(modello, marca, colore);
		this.targa = targa;
	}
	
	public Veicolo(String modello, String marca, String colore) {
		this(modello, marca);
		this.colore = colore;
	}
	
	public Veicolo(String modello, String marca) {
		this.modello = modello;
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public String getMarca() {
		return marca;
	}

	public String getTarga() {
		return targa;
	}

	

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Veicolo [modello=" + modello + ", marca=" + marca + ", targa=" + targa + ", colore=" + colore + "]";
	}

	
	public void setTarga(String targa, String prefisso) {
		this.targa = prefisso + " - " + targa;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public void setTarga(String targa, int prefisso) {
		this.targa = prefisso + " - " + targa;
	}
	
	public void setTarga(int prefisso, String targa) {
		this.targa = prefisso + " - " + targa;
	}

}
