package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utente_jpa database table.
 * 
 */
@Entity
@Table(name="utente_jpa")
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_utente")
	private Integer id;

	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String nome;

	public Utente() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", cognome=" + cognome + ", email=" + email + ", nome=" + nome + "]";
	}
	
}