package contocorrente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import thread.java.TestThread;

public class ContoCorrente {
	
	private double saldo;
	private String titolare;
	Logger log = LoggerFactory.getLogger(TestThread.class);
	
	
	public ContoCorrente(String titolare) {
		this.titolare = titolare;
	}
	
	public double deposito(double fondi) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			log.error("Errore Thread!!!");
		}
		this.saldo+=fondi;
		return this.saldo;
	}
	
	public synchronized double prelievo(double fondi) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			log.error("Errore Thread!!!");
		}
		
		if(controlloPrelievo(fondi)) {
			System.out.println("Prelievo " + this.titolare + " €" + fondi);
			this.saldo -= fondi;
		}
		return this.saldo;
	}
	
	public boolean controlloPrelievo(double fondi) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			log.error("Errore Thread!!!");
		}
		return this.saldo >= fondi;
	}

	@Override
	public String toString() {
		return "ContoCorrente [saldo=" + saldo + ", titolare=" + titolare + "]";
	}

}
