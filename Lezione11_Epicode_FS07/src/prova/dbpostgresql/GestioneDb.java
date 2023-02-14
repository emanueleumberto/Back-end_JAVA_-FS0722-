package prova.dbpostgresql;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestioneDb {
	
	static ArrayList<Utente> listaUtenti = new ArrayList<Utente>();

	public static void main(String[] args) {
		try {
			DbConnection db = new DbConnection();
			db.creaTabUtenti();
			
			Utente u1 = new Utente("Mario", "Rossi", "1/8/1999", 23, "m.rossi@example.com");
			Utente u2 = new Utente("Giuseppe", "Verdi", "15/3/2003", 20, "g.verdi@example.com");
			//db.salvaUtente(u2);
			
			listaUtenti = db.leggiUtenti();
			
			Utente ut = listaUtenti.get(0);
			ut.email = "mariolino.rossi@example.com";
			
			//db.modificaUtente(ut);
			
			//Utente utd = db.leggiUtenteDaId(4);
			//System.out.println(utd);
			
			//db.eliminaUtente(utd);
			
			/*for (Utente utente : listaUtenti) {
				System.out.println(utente);
			}*/
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
