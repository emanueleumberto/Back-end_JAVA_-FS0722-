package mainProject;

import java.util.Date;
import java.util.GregorianCalendar;

import dao.EventoDAO;
import dao.LocationDAO;
import dao.PartecipazioneDAO;
import dao.PersonaDAO;
import model.Evento;
import model.Location;
import model.Partecipazione;
import model.Persona;
import model.Sesso;
import model.StatoPartecipazione;
import model.TipoEvento;

public class GestioneEventi {

	public static void main(String[] args) {
		//Evento e = saveEvento();
		//System.out.println(e);
		
		Location location = saveLocation();
		Evento evento = saveEvento(location);
		Persona persona = savePersona();
		
		Partecipazione partecipazione = savePartecipazione(evento,persona);
	}
	
	/*public static Evento saveEvento() {
		Evento ev = new Evento();
		ev.setTitolo("Lezione");
		ev.setDescrizione("Lezione Java");
		ev.setDataEvento(new Date());
		ev.setTipoEvento(TipoEvento.PRIVATO);
		ev.setNumeroMassimoPartecipanti(35);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		
		return ev;
	}*/
	
	private static Partecipazione savePartecipazione(Evento evento, Persona persona) {
		Partecipazione part = new Partecipazione();
		part.setEvento(evento);
		part.setPersona(persona);
		part.setStato(StatoPartecipazione.CONFERMATA);
		
		PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();
		partecipazioneDAO.save(part);
		return part;
	}

	private static Persona savePersona() {
		Persona per = new Persona();
		per.setNome("Mario");
		per.setCognome("Rossi");
		per.setEmail("m.rossi@google.com");
		per.setSesso(Sesso.MASCHIO);
		per.setDataDiNascita(new GregorianCalendar(1980,9, 23).getTime());
		PersonaDAO personaDAO = new PersonaDAO();
		personaDAO.save(per);
		return per;
	}

	private static Location saveLocation() {
		Location loc = new Location();
		loc.setCitta("Firenze");
		loc.setNome("Stadio Franchi");
		
		LocationDAO locationDAO = new LocationDAO();
		locationDAO.save(loc);
		return loc;
	}

	private static Evento saveEvento(Location loc) {
		Evento ev = new Evento();
		ev.setDataEvento(new Date());
		ev.setTitolo("Partita");
		ev.setDescrizione("Finale di coppa");
		ev.setNumeroMassimoPartecipanti(10);
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setLocation(loc);
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		return ev;
	}

}
