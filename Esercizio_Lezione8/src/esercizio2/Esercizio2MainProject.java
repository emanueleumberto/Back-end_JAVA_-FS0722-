package esercizio2;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Esercizio2MainProject {
	
	static Logger log = LoggerFactory.getLogger(Esercizio2MainProject.class);

	public static void main(String[] args) {
		int[] elementi = Multithread.popolaArray(3000);
		List<Integer> listaRisultati = new ArrayList<Integer>();
		
		Multithread m1 = new Multithread(elementi, 0, 1000, listaRisultati);
		Multithread m2 = new Multithread(elementi, 1000, 1000, listaRisultati);
		Multithread m3 = new Multithread(elementi, 2000, 1000, listaRisultati);
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}

		int sommaTotale = 0;
		for (Integer val : listaRisultati) {
			sommaTotale += val;
		}
		
		//System.out.println("Somma totale: " + sommaTotale);
		log.info("Somma totale: " + sommaTotale);
	}

}
