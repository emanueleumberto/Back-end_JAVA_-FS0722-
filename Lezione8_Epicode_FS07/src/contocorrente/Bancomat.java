package contocorrente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import thread.java.TestThread;

public class Bancomat extends Thread {
	
	private ContoCorrente conto;
	Logger log = LoggerFactory.getLogger(TestThread.class);
	

	public Bancomat(ContoCorrente conto) {
		this.conto = conto;
	}
	
	public void preleva(double fondi) {
		if(this.conto.controlloPrelievo(fondi)) {
			this.conto.prelievo(fondi);
			log.info("Prelievo Effettuato su " + this.conto);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.preleva(100);
		}
	}
	
	

}
