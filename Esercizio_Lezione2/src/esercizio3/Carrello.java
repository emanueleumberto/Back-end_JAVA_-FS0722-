package esercizio3;

public class Carrello {
	
	static Cliente clienteAssociato;
	static Articolo[] elencoArticoli = new Articolo[5];
	static double totaleCostoArticoli = 0;
	
	public static void inserisciArticoloNelCarrello(Cliente cliente, Articolo articolo){
		clienteAssociato = cliente;
		if(elencoArticoli[0] != null) {
			elencoArticoli[0] = articolo;
			totaleCostoArticoli += articolo.prezzo;
		} else if(elencoArticoli[1] != null)
		{
			elencoArticoli[1] = articolo;
			totaleCostoArticoli += articolo.prezzo;
		}
		else if(elencoArticoli[2] != null)
		{
			elencoArticoli[2] = articolo;
			totaleCostoArticoli += articolo.prezzo;
		}
		else if(elencoArticoli[3] != null)
		{
			elencoArticoli[3] = articolo;
			totaleCostoArticoli += articolo.prezzo;
		}
		else if(elencoArticoli[4] != null)
		{
			elencoArticoli[4] = articolo;
			totaleCostoArticoli += articolo.prezzo;
		}
		
	}
	



}
