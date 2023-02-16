package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_utente")
	private Integer idUtente;

	@Column(name="citta_utente")
	private String cittaUtente;

	@Column(name="cognome_utente")
	private String cognomeUtente;

	@Column(name="nome_utente")
	private String nomeUtente;

	@Enumerated(EnumType.STRING)
	private String permessi;

	public Utente() {
	}

	public Integer getIdUtente() {
		return this.idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getCittaUtente() {
		return this.cittaUtente;
	}

	public void setCittaUtente(String cittaUtente) {
		this.cittaUtente = cittaUtente;
	}

	public String getCognomeUtente() {
		return this.cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public String getNomeUtente() {
		return this.nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getPermessi() {
		return this.permessi;
	}

	public void setPermessi(String permessi) {
		this.permessi = permessi;
	}

}