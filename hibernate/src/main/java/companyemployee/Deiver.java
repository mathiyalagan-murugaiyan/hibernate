package companyemployee;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();		
		Country c = new Country();
		
//		c.setCname("India");
//		c.setcNoState(29);
//		c.setCapitalcity("delhi");
//		
//		
//		State s1 = new State();
//		s1.setSname("tamilnadu");
//		s1.setsCapitalCity("chennai");
//		s1.setCountry(c);
//		
//		State s2 = new State();
//		s2.setSname("telungana");
//		s2.setsCapitalCity("hydrabad");
//		s2.setCountry(c);
//		
//		State s3 = new State();
//		
//		s3.setSname("maharastra");
//		s3.setsCapitalCity("mumbai");
//		s3.setCountry(c);
//		
//		List<State> list = new ArrayList<State>();
//		
//		list.add(s3);
//		list.add(s2);
//		list.add(s1);
//		
//		c.setStates(list);
//		
//		et.begin();
//		em.persist(c);
//		et.commit();
		
		//em.find(State.class, 1);
		
		em.find(Country.class, 1);

	}

}
