package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {

		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mathi");
	 		EntityManager em=emf.createEntityManager();
	 		EntityTransaction et=em.getTransaction();
		


		Application a1 = new Application();
		a1.setAname("Whats app");
		a1.setaCost(100);
		
		Application a2 = new Application();
		a2.setAname("facebook");
		a2.setaCost(150);
		
		Application a3 = new Application();
		a3.setAname("telegaram");
		a3.setaCost(100);
		
		
		User u1 = new User();
		u1.setUname("jack");
		u1.setUcontact(938363543);
		
		User u2 = new User();
		
		u2.setUname("hari");
		u2.setUcontact(892726257);
		
		
		List<Application> apps1 = new  ArrayList<Application>();
		
		apps1.add(a1);
		apps1.add(a2);
		apps1.add(a3);
		
		
		List<Application> apps2 = new  ArrayList<Application>();
		
		apps2.add(a2);
		apps2.add(a3);
		
		u1.setApps(apps1);
		u2.setApps(apps2);
		
		et.begin();
		em.persist(u2);
		em.persist(u1);
		et.commit();
	}  

}
