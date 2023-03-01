package com.GodfathersPizza.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PropertySource("classpath:application.properties")
public class Ordine {
	
	private int numeroOrdine;
	private Tavolo tavolo;
	private Map<Integer, Prodotto> ordinato = new HashMap<Integer, Prodotto>();
	private StatoOrdine stato = StatoOrdine.IN_CORSO;
	private int numeroCoperti = 1;
	private LocalDateTime oraAcquisizione = LocalDateTime.now();
	
	@Value("${GodfathersPizza.costoCoperto}")
	private String costoCoperto;
	
	public Prodotto addProdotto(Prodotto p) {
		ordinato.put(ordinato.size()+1, p);
		return ordinato.get(p);
	}
	
	public void removeProdotto(Prodotto p) {
		if(ordinato.containsKey(p)) {
			ordinato.remove(p);
		} else {
			System.out.println("Nessun proldotto nel tuo ordine!!");
		}
	}
	
	public double calcolaTotaleOrdine() {
		return Double.parseDouble(costoCoperto);
	}
	
}
