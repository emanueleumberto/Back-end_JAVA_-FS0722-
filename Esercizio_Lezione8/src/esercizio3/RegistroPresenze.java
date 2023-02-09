package esercizio3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	
	//Mario Rossi@5#Giorgio Bianchi@7#Gianni Verdi@7
	static List<Presenza> listaPresenze = new ArrayList<Presenza>();
	static File file = new File("presenze/listaPresenze.txt");

	public static void main(String[] args) {

		try {
			
			leggiPresenzeTxt();
			
			//Presenza p = new Presenza("Francesca", "Neri", 6);
			//listaPresenze.add(p);
			//salvaPresenzeTxt(listaPresenze);
			
			stampaPresenze();
			
			
		} catch (IOException e) {
			System.out.println("Errore!!!");
		}

	}
	
		
	public static void salvaPresenzeTxt(List<Presenza> listaPresenze ) throws IOException {
		String presenzaTxt = "";
		for (Presenza p : listaPresenze) {
			presenzaTxt += (p.getNome()+ " " +p.getCognome()+"@"+p.getNumero()+"#");
		}
		FileUtils.writeStringToFile(file, presenzaTxt, "UTF-8");
		System.out.println("Dati salvati correttamente sul file!");
	}
	
	public static void leggiPresenzeTxt() throws IOException {
		listaPresenze.clear();
		String nome;
		String cognome;
		int numero;
		
		String txtFile = FileUtils.readFileToString(file, "UTF-8");
		//Mario Rossi@5#Giorgio Bianchi@7#Gianni Verdi@7
		
		String[] objTxt =  txtFile.split("#");
		//Mario Rossi@5
		//Giorgio Bianchi@7
		//Gianni Verdi@7
		
		for (String obj : objTxt) {
			String[] presTxt = obj.split("@");
			//presTxt[0] -> Mario Rossi
			//presTxt[1] -> 5
			numero = Integer.parseInt(presTxt[1]);
			
			String[] name = presTxt[0].split(" ");
			//name[0] -> Mario
			//name[1] -> Rossi
			
			nome = name[0];
			cognome = name[1];
			
			Presenza p =  new Presenza(nome, cognome, numero);
			listaPresenze.add(p);
		}
		
	}

	public static void stampaPresenze() {
		for (Presenza presenza : listaPresenze) {
			System.out.println(presenza);
		}
	}
}
