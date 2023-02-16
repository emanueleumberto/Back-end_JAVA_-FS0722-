package model_TABLE_PER_CLASS;

import javax.persistence.Entity;

@Entity
public class Automobile3 extends Veicolo3 {
	
	private Integer nporte;
	private String alimentazione;
	
	public Automobile3() {
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
