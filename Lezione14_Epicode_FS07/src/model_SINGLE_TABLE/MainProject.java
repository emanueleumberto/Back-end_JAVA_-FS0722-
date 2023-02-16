package model_SINGLE_TABLE;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model_JOINED.Automobile2;
import model_JOINED.Moto2;

public class MainProject {
	
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEreditarieta");

	public static void main(String[] args) {
		
		// Creo automobile
		Automobile a1 = new Automobile();
		a1.setMarca("Fiat"); // Eredito da Veicolo
		a1.setModello("500"); // Eredito da Veicolo
		a1.setNporte(3); // Definisco in Automobile
		a1.setAlimentazione("Benzina"); // Definisco in Automobile
		
		// Creo moto
		Moto m1 = new Moto();
		m1.setMarca("Honda");
		m1.setModello("Hornet");
		m1.setCilindrata(900);
		m1.setNposti(1);
		
		// Creo automobile
		Automobile a2 = new Automobile();
		a2.setMarca("BMW"); // Eredito da Veicolo
		a2.setModello("X5"); // Eredito da Veicolo
		a2.setNporte(5); // Definisco in Automobile
		a2.setAlimentazione("Diesel"); // Definisco in Automobile
				
		// Creo moto
		Moto m2 = new Moto();
		m2.setMarca("Suzuki");
		m2.setModello("Abcdef");
		m2.setCilindrata(1200);
		m2.setNposti(2);
		
		// Salvo nel DB
		//saveAutomobile(a1);
		//saveAutomobile(a2);
		//saveMoto(m1);
		//saveMoto(m2);
		
		Automobile aDB = getAutomobileById(1);
		System.out.println(aDB.getMarca() + " " + aDB.getModello() + " " + aDB.getAlimentazione());
		
		Moto mDB = getMotoById(3);
		System.out.println(mDB.getMarca() + " " + mDB.getModello() + " " + mDB.getCilindrata());
	}
	
	// 
	public static void saveAutomobile(Automobile a) {
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(a);
			em.getTransaction().commit();
			log.info("Automobile " + a.getMarca() + " " + a.getModello() + " salvata nel DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}

	}
	
	public static void saveMoto(Moto m) {
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();
			log.info("Moto " + m.getMarca() + " " + m.getModello() + " salvata nel DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}

	}
	
	public static Automobile getAutomobileById(long id) {
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		return em.find(Automobile.class, id);
		} finally {
			em.close();
		}
	}
	
	public static Moto getMotoById(long id) {
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		return em.find(Moto.class, id);
		} finally {
			em.close();
		}
	}
}
