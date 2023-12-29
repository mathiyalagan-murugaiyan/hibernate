package personAadhar_OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AadharDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mathi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public Aadhar SaveAadhar(Aadhar a) {
		et.begin();
		em.persist(a);
		et.commit();
		return a;
	}
	
    public Aadhar findAadhar(int id) {	
    
    	Aadhar exiAadhar=em.find(Aadhar.class,id);
    	if(exiAadhar!=null){
    		return exiAadhar;
    	}
    	else {
    		return null;
    	}
    }
    
    public Aadhar deleteByID(int id) {
    	Aadhar exAadhar=em.find(Aadhar.class,id);
    	Person p = new Person();
    	p.setPadhaar(null);
    	
    	if(exAadhar!=null) {
    		et.begin();
    		em.merge(p);
    		em.remove(exAadhar);
    		et.commit();
    		return exAadhar;
    	}
    	return null;
    }
    
    public Aadhar  updateAadhar(Aadhar a,int id) { 
    
    	Aadhar exAadhar=em.find(Aadhar.class,id);
    	
    	
    	if(exAadhar!=null){
    		a.setAid(id);
    		et.begin();
    		em.merge(a);
    		et.commit();
    		return a;
    	}
    	return null;
    }
   
}