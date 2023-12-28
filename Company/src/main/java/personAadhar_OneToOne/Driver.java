package personAadhar_OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Driver {
     public static void main(String[] args) {
    	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mathi");
    		EntityManager em=emf.createEntityManager();
    		EntityTransaction et=em.getTransaction();
    		
   		Aadhar a = new Aadhar();
    		a.setAcontact(1234567999);
    		a.setAaddress("mumbai");
    		
    		Person p=new Person();
    		p.setPname("jayachandran");
    		p.setPcontact(1234567999);
    		p.setPadhaar(a);
    		
    		et.begin();
    		em.persist(a);
    		em.persist(p);
    		et.commit();
    		
    		AadharDao aa=new AadharDao();
    		aa.deleteByID(28);
    		System.out.println(aa.findAadhar(22));
    		a.setAid(22);
    		a.setAcontact(1234567999);
    		a.setAaddress("chennai");
    		aa.updateAadhar(a, 22);
    		
    		
    		PersonDao pp=new PersonDao();
    		pp.deleteByID(29);
    		System.out.println(pp.findPerson(27)); 
    		p.setPid(27);
    		p.setPname("mathi");
    		p.setPcontact(1234566768);
    		p.setPadhaar(a);
    		pp.updatePerson(p, 27);
    		
	}
}