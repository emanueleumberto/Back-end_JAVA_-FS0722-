package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Multithread implements Runnable {
	
	int[] arrayElementi;
	int indiceIniziale;
	int numeroElementi;
	static List<Integer> risultati;
	static Logger log = LoggerFactory.getLogger(Multithread.class);

	public Multithread(int[] arrayElementi, int indiceIniziale, int numeroElementi, List<Integer> risultati) {
		this.arrayElementi = arrayElementi;
		this.indiceIniziale = indiceIniziale;
		this.numeroElementi = numeroElementi;
		this.risultati = risultati;
	}
	
	@Override
	public void run() {

		int sommaParziale = 0;
		for (int i = indiceIniziale; i < indiceIniziale+numeroElementi; i++) {
			sommaParziale += arrayElementi[i];
		}
		
		//System.out.println("Somma Thread: " + sommaParziale);
		log.info("Somma Thread: " + sommaParziale);
		risultati.add(sommaParziale);
		
	}
	
	public static int[] popolaArray(int size) {
		Random rand = new Random();
		int[] dati = new int[size];
		for (int i = 0; i < size; i++) {
			dati[i] = rand.nextInt(11);
		}
		return dati;
	}

}
