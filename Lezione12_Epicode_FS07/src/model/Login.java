package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"Login\"")
@NamedQuery(name="Login.findAll", query="SELECT l FROM Login l")
public class Login implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_login")
	private Integer id;

	@Column(name="id_utente")
	private Integer idUtente;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false, unique = true)
	private String username;

	public Login() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdUtente() {
		return this.idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}