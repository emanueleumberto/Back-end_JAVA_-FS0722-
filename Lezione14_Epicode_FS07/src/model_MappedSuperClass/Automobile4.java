package model_MappedSuperClass;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Automobile.findAll", query="SELECT a FROM Automobile4 a")
public class Automobile4 extends Veicolo4 {
	
	private Integer nporte;
	private String alimentazione;
	
	public Automobile4() {
		super();
	}

	public Integer getNporte() {
		return nporte;
	}

	public void setNporte(Integer nporte) {
		this.nporte = nporte;
	}

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

}
