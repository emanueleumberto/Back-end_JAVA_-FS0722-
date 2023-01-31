package esercizio3;

import java.util.Date;

public class Cliente {
	String codiceCliente;
	String nome;
	String cognome;
	String email;
	Date dataIscrizione;
	
	public Cliente(String codiceCliente, String nome, String cognome, String email) {
		this.codiceCliente = codiceCliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataIscrizione = new Date();
	}

	@Override
	public String toString() {
		return "Cliente [codiceCliente=" + codiceCliente + ", nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + ", dataIscrizione=" + dataIscrizione + "]";
	}
	
	

}
