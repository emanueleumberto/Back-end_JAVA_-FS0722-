package soluzione.esercizio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatalogoBibliotecario {
	
	static Logger log = LoggerFactory.getLogger(CatalogoBibliotecario.class);
	static private Map<String, ElementoCartaceo> archivioMap = new HashMap<String, ElementoCartaceo>();
	static private List<ElementoCartaceo> archivioList = new ArrayList<ElementoCartaceo>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void aggiungi(ElementoCartaceo e) {
		 archivioList.add(e);
		 archivioMap.put(e.getIsbn(), e);
		 log.info("Elemento aggiunto alla lista/mappa!!!");
	}
	
	public static void rimuovi(String isbn) {
		archivioMap.remove(isbn);
		archivioList.removeIf(e -> e.getIsbn().equals(isbn));
		//archivioList = archivioList.stream().filter(e -> e.getIsbn() != isbn).collect(Collectors.toList());
		log.info("Elemento rimosso dalla lista/mappa!!!");
	}
	
	public static ElementoCartaceo ricercaPerIsbn(String isbn) {
		List<ElementoCartaceo> ele = archivioList.stream().filter(e -> e.getIsbn().equals(isbn)).collect(Collectors.toList());
		ElementoCartaceo result = ele.get(0);
		return archivioMap.get(isbn);
	}

}
