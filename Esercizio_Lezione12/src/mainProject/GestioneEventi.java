package mainProject;

import java.util.Date;

import dao.EventoDAO;
import model.Evento;
import model.TipoEvento;

public class GestioneEventi {

	public static void main(String[] args) {
		Evento e = saveEvento();
		System.out.println(e);
	}
	
	public static Evento saveEvento() {
		Evento ev = new Evento();
		ev.setTitolo("Lezione");
		ev.setDescrizione("Lezione Java");
		ev.setDataEvento(new Date());
		ev.setTipoEvento(TipoEvento.PRIVATO);
		ev.setNumeroMassimoPartecipanti(35);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		
		return ev;
	}

}
