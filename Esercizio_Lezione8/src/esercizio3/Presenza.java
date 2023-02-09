package esercizio3;

public class Presenza {
	
	private String nome;
	private String cognome;
	private int numero;
	
	public Presenza(String nome, String cognome, int numero) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Presenza [nome=" + nome + ", cognome=" + cognome + ", numero=" + numero + "]";
	}
	

}
