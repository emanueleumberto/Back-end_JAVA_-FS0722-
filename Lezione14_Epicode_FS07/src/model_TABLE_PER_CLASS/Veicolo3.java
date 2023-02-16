package model_TABLE_PER_CLASS;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "veicolo_3")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Veicolo3 {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String modello;
	
	@Column(nullable = false)
	private String marca;
	
	public Veicolo3() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
