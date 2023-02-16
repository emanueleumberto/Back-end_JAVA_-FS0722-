package model_MappedSuperClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model_SINGLE_TABLE.Automobile;
import model_SINGLE_TABLE.Moto;

public class MainProject {
	
	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEreditarieta");

	public static void main(String[] args) {
		
		// Creo automobile
		Automobile4 a1 = new Automobile4();
		a1.setMarca("Fiat"); // Eredito da Veicolo
		a1.setModello("500"); // Eredito da Veicolo
		a1.setNporte(3); // Definisco in Automobile
		a1.setAlimentazione("Benzina"); // Definisco in Automobile
		
		// Creo moto
		Moto4 m1 = new Moto4();
		m1.setMarca("Honda");
		m1.setModello("Hornet");
		m1.setCilindrata(900);
		m1.setNposti(1);
		
		// Creo automobile
		Automobile4 a2 = new Automobile4();
		a2.setMarca("BMW"); // Eredito da Veicolo
		a2.setModello("X5"); // Eredito da Veicolo
		a2.setNporte(5); // Definisco in Automobile
		a2.setAlimentazione("Diesel"); // Definisco in Automobile

		// Creo moto
		Moto4 m2 = new Moto4();
		m2.setMarca("Suzuki");
		m2.setModello("Abcdef");
		m2.setCilindrata(1200);
		m2.setNposti(2);
		
		// Salvo nel DB
		saveAutomobile(a1);
		saveAutomobile(a2);
		saveMoto(m1);
		saveMoto(m2);
		
		//Automobile4 aDB = getAutomobileById(1);
		//System.out.println(aDB.getId() + " - " +  aDB.getMarca() + " " + aDB.getModello() + " " + aDB.getAlimentazione());
		
		//Moto4 mDB = getMotoById(3);
		//System.out.println(mDB.getId() + " - " + mDB.getMarca() + " " + mDB.getModello() + " " + mDB.getCilindrata());
	
		
	}
	
	// 
	public static void saveAutomobile(Automobile4 a) {
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
	
	public static void saveMoto(Moto4 m) {
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
	
	public static Automobile4 getAutomobileById(long id) {
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		return em.find(Automobile4.class, id);
		} finally {
			em.close();
		}
	}
	
	public static Moto4 getMotoById(long id) {
		EntityManager em = emf.createEntityManager();
		try {
		em.getTransaction().begin();
		return em.find(Moto4.class, id);
		} finally {
			em.close();
		}
	}
	

}
