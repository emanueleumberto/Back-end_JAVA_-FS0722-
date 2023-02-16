package model;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static EntityManagerFactory entityManagerFactory = Persistence .createEntityManagerFactory("Esercizio_Lezione14");
	

	public static void main(String[] args) {
		//Utente e = saveUtente();
		Utente e = getUtenteById(2);
		//System.out.println(e);
		//e.setPermessi(Permessi.admin);
		//updateUtente(e);
		removeUtente(e);
		
		//List<Utente> lista = getAllUtenti();
		//for (Utente utente : lista) {
		//	System.out.println(utente);
		//}
	}
	
	public static Utente saveUtente() {
		Utente u = new Utente();
		u.setNomeUtente("Giuseppe");
		u.setCognomeUtente("Verdi");
		u.setCittaUtente("Milano");
		u.setPermessi(Permessi.user);
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
		
		return u;

	}

	public static Utente getUtenteById(int id) {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		try {
			em.getTransaction().begin();
			return em.find(Utente.class, id);
		} finally {
			em.close();
		}
	}

	public static void removeUtente(Utente u) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			em.getTransaction().begin();
			//em.remove(u);
			em.remove(em.contains(u) ? u : em.merge(u));
			em.getTransaction().commit();
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	public static void updateUtente(Utente u) {
		EntityManager em = entityManagerFactory.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(u);
			em.getTransaction().commit();
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public static List<Utente> getAllUtenti() {
		EntityManager em = entityManagerFactory.createEntityManager();
		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();
	}
}
