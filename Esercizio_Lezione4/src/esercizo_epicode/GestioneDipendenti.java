package esercizo_epicode;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente mario = new Dipendente("0001", Dipartimento.PRODUZIONE);
		Dipendente luigi = new Dipendente("0002", Dipartimento.PRODUZIONE);
		Dipendente antonio = new Dipendente("0003", (Dipendente.stipendioBase *  1.2) , 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente francesca = new Dipendente("0004", (Dipendente.stipendioBase *  2) , 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		Dipendente[] dipendenti = new Dipendente[4];
		
		dipendenti[0] = mario;
		dipendenti[1] = luigi;
		dipendenti[2] = antonio;
		dipendenti[3] = francesca;
		
		mario.promuovi();
		antonio.promuovi();
		
		mario.stampaDatiDipendente();
		luigi.stampaDatiDipendente();
		antonio.stampaDatiDipendente();
		francesca.stampaDatiDipendente();
		
		double stipendiMensili = 0;
		for (int i = 0; i < dipendenti.length; i++) {
			stipendiMensili += Dipendente.calcolaPaga(dipendenti[i], 5);
		}
		
		System.out.println("Totale stipendi: " + stipendiMensili);
	}

}
