package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Utente;

public class GestioneUtenteJPA {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione12_Epicode_FS07");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		try {
		
		Utente u = new Utente();
		//u.setNome("Mario");
		//u.setCognome("Rossi");
		//u.setEmail("m.rossi@example.com");
		
		u.setNome("Giuseppe");
		u.setCognome("Verdi");
		u.setEmail("g.verdi@example.com");
		
		//aggiungiUtente(u);
		
		Utente mioUtente = leggiUtente(2);
		//System.out.println(mioUtente);
		
		//mioUtente.setEmail("mario.rossi@example.com");
		//modificaUtente(mioUtente);
		
		//eliminaUtente(mioUtente);
		
		//List<Utente> lista = leggiTutti();
		List<Utente> lista = leggiUtentiEmailLikeCom();
		
		for (Utente utente : lista) {
			System.out.println(utente);
		}
		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			em.close();
			emf.close();
		}

	}
	
	private static void aggiungiUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto nel DB!!!");
	}
	
	private static Utente leggiUtente(int id) {
		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id);
		em.getTransaction().commit();
		return u;
	}
	
	private static void  modificaUtente(Utente u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("Utente modificato nel DB!!!");
	}
	
	private static void eliminaUtente(Utente u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("Utente eliminato nel DB!!!");
	}

	private static List<Utente> leggiTutti(){
		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();
	}
	
	private static List<Utente> leggiUtentiEmailLikeCom() {
		Query q = em.createQuery("SELECT u FROM Utente u WHERE u.email LIKE '%com'");
		return q.getResultList();
	}
}
