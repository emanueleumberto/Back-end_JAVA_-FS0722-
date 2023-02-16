package model_TABLE_PER_CLASS;

import javax.persistence.Entity;

@Entity
public class Moto3 extends Veicolo3 {
	
	private Integer nposti;
	private Integer cilindrata;
	
	public Moto3() {
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
