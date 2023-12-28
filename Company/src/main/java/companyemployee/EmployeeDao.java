package companyemployee;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDao {
	
	
	public Employee find(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		Company c = em.find(Company.class, id);
		
		List<Employee> ems = c.getEms();
		List<Employee> newList = new ArrayList<Employee>();
		for(Employee e :ems) {
			if(!e.getEname().equals("ram")){
				
				ems.remove(e.getEid());
				newList.add(e);
				
				
			}
			
		}
		et.begin();
		c.setEms(newList);
	
		em.merge(c);
		et.commit();
		return null;

	}

}
