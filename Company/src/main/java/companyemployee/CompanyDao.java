package companyemployee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDao {
	
	public Company deleteEmp(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Company c = em.find(Company.class, id);
		if(c != null) {
			et.begin();
			em.remove(c);
			et.commit();
			return c;
		}
		return null;
	}

}
