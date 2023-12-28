package personAadhar_OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mathi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Person SavePerson(Person p) {
		et.begin();
		em.persist(p);
		et.commit();
		return p;
	}
	
    public Person findPerson(int id) {	
    
    	Person exiPerson=em.find(Person.class,id);
    	if(exiPerson!=null){
    		return exiPerson;
    	}
    	else {
    		return null;
    	}
    }
    
    public Person deleteByID(int id) {
    	Person exPerson=em.find(Person.class,id);
    	if(exPerson!=null) {
    		et.begin();
    		em.remove(exPerson);
    		et.commit();
    		return exPerson;
    	}
    	return null;
    }
    
    public Person updatePerson(Person p,int id) { 
    
    	Person exPerson=em.find(Person.class,id);
    	if(exPerson!=null){
    		p.setPid(id);
    		et.begin();
    		em.merge(p);
    		et.commit();
    		return p;
    	}
    	return null;
    }
    

}