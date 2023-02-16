package model_JOINED;

import javax.persistence.Entity;

@Entity
public class Moto2 extends Veicolo2 {
	
	private Integer nposti;
	private Integer cilindrata;
	
	public Moto2() {
		super();
	}

	public Integer getNposti() {
		return nposti;
	}

	public void setNposti(Integer nposti) {
		this.nposti = nposti;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}
	
}
