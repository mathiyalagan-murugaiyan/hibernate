package manytoone_train_passenger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PassengerDao {
	
	public  Passenger findById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Passenger p = em.find(Passenger.class , id);
		if(p != null) {
			et.begin();
			em.persist(p);
			et.commit();
			return p;
		}
		return null;
}



	public Train findByTrain(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Train t = em.find(Train.class , id);
		if(t != null) {
			et.begin();
			em.persist(t);
			et.commit();
			return t;
		}
		return null;
}
	
	public Train deleteByTrain(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Train t = em.find(Train.class , id);
		
		
		if(t != null ) {
			
			
			et.begin();
			em.remove(t);
			et.commit();
			return t;
		}
		return null;
		
	}
}
