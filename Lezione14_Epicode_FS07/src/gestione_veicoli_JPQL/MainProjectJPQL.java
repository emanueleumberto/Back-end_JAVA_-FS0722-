package gestione_veicoli_JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model_MappedSuperClass.Automobile4;
import model_MappedSuperClass.MainProject;

public class MainProjectJPQL {

	static Logger log = LoggerFactory.getLogger(MainProject.class);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEreditarieta");

	public static void main(String[] args) {
		
		//salvaAutomobile();
		
		//Automobile4 a = leggiAuto(2);
		//log.info("Automobile " + a.getMarca() + " " + a.getModello());
		
		//a.setModello("Serie3");
		//modificaAutomobile(a);
		
		//eliminaAuto(a);
		
		//List<Automobile4> lista = leggiTutteLeAuto();
		
		//List<Automobile4> lista = leggiAutoDaMarca("BMW");
		
		//List<Automobile4> lista = leggiTutteLeAutoCriteria();
		List<Automobile4> lista = leggiAutoDaMarcaCriteria("Fiat");
		for (Automobile4 auto : lista) {
			log.info("Automobile " + auto.getMarca() + " " + auto.getModello());
		}
		
		//long id = leggiUltimaAutoInserita();
		//log.info("ID: " + id );
	}
	
	public static List<Automobile4> leggiTutteLeAuto() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createNamedQuery("Automobile.findAll");
		return (List<Automobile4>) q.setMaxResults(2);
	}
	
	public static List<Automobile4> leggiTutteLeAutoCriteria() {
		EntityManager em = emf.createEntityManager();
		//JPQL
		//Query q = em.createQuery("SELECT a FROM Automobile4 a");
		
		//CRITERIA API
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Automobile4> qu = cb.createQuery(Automobile4.class);
		Root<Automobile4> c = qu.from(Automobile4.class);
		qu.select(c);
		
		Query q = em.createQuery(qu);
		return q.getResultList();
	}
	
	private static List<Automobile4> leggiAutoDaMarca(String marca) {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("SELECT a FROM Automobile4 a WHERE a.marca = :marca");
		q.setParameter("marca", marca);
		return q.getResultList();
	}
	
	private static List<Automobile4> leggiAutoDaMarcaCriteria(String marca) {
		EntityManager em = emf.createEntityManager();
		//JPQL
		//Query q = em.createQuery("SELECT a FROM Automobile4 a WHERE a.marca = :marca");
		
		//CRITERIA API
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Automobile4> qu = cb.createQuery(Automobile4.class);
		Root<Automobile4> c = qu.from(Automobile4.class);
		ParameterExpression<String> p = cb.parameter(String.class);
		//qu.select(c).where(cb.equal(c.get("marca"), p));
		qu.select(c).where(cb.notEqual(c.get("marca"), p));
		
		Query q = em.createQuery(qu);
		q.setParameter(p, marca);
		return q.getResultList();
	}
	
	private static long leggiUltimaAutoInserita() {
		EntityManager em = emf.createEntityManager();
		//Query q = em.createQuery("SELECT MAX(a.id) FROM Automobile4 a");
		Query q = em.createQuery("SELECT a.modello, MAX(a.id) FROM Automobile4 a");
		return (long) q.getSingleResult();
	}

	public static void salvaAutomobile() {
		EntityManager em = emf.createEntityManager();

		// Creo automobile
		Automobile4 a1 = new Automobile4();
		a1.setMarca("Ford"); // Eredito da Veicolo
		a1.setModello("Fiesta"); // Eredito da Veicolo
		a1.setNporte(5); // Definisco in Automobile
		a1.setAlimentazione("Gas"); // Definisco in Automobile

		try {
			em.getTransaction().begin();
			em.persist(a1);
			em.getTransaction().commit();
			log.info("Automobile " + a1.getMarca() + " " + a1.getModello() + " salvata nel DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}

	}

	public static void eliminaAuto(Automobile4 a) {
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.remove(a);
			em.getTransaction().commit();
			log.info("Automobile " + a.getMarca() + " " + a.getModello() + " rimossa dal DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}
	
	private static Automobile4 leggiAuto(long id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Automobile4 a = em.find(Automobile4.class, id);
			em.getTransaction().commit();
			return a;
		} finally {
			em.close();
		}
	}
	
	private static void  modificaAutomobile(Automobile4 a) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(a);
			em.getTransaction().commit();
			log.info("Automobile " + a.getMarca() + " " + a.getModello() + " modificata nel DB!!!");
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	
	}

}
