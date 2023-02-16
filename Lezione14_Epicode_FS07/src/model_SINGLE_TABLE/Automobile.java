package model_SINGLE_TABLE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//Se voglio cambiare il nome del valore discriminante altrimenti chiamato come la classe 
@DiscriminatorValue("automobile_1")
public class Automobile extends Veicolo {
	
	private Integer nporte;
	private String alimentazione;
	
	public Automobile() {
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
