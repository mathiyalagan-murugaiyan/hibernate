package personAadhar_OneToOne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mathi");
 		EntityManager em=emf.createEntityManager();
 		EntityTransaction et=em.getTransaction();
		
//		Person p = new Person();
//		p.setPname("mathi");
//		p.setPcontact(937353434);
//		
//		Aadhar a = new Aadhar();
//		a.setAcontact(937353436);
//		a.setAaddress("chennai");
//		
//		p.setPadhaar(a);
//	    a.setP(p);
//	    
//	    et.begin();
//	    em.persist(p);
//	    et.commit();
	    
	    
//	    
//	    String query = "select p from Person p";
//	    
//	    Query q1 = em.createQuery(query);
//	    
//	  List<Person> p1 = q1.getResultList();
//	  
//	  for(Person person : p1) {
//		  System.out.println(person);
//	  }
//	
 		
 /******************************************************************************/
 		//save 3 person with 3 aadhar
 		
// 		Person p1 = new Person();
//		p1.setPname("raja");
//		p1.setPcontact(937353434);
//	
//		
//		Person p2 = new Person();
//		p2.setPname("chandran");
//		p2.setPcontact(937353434);
//		
//		Person p3 = new Person();
//		p3.setPname("ram");
//		p3.setPcontact(937353434);
//		
//		Aadhar a1 = new Aadhar();
//		a1.setAcontact(93743534);
//		a1.setAaddress("chennai");
//		a1.setP(p1);
//		p1.setPadhaar(a1);
//		
//		Aadhar a2 = new Aadhar();
//		a2.setAcontact(937353436);
//		a2.setAaddress("trichy");
//		a2.setP(p2);
//		p2.setPadhaar(a2);
//		
//	
//		Aadhar a3 = new Aadhar();
//		a3.setAcontact(93736346);
//		a3.setAaddress("thiruvarur");
//		a3.setP(p3);
//		p3.setPadhaar(a3);
//		
// 		et.begin();
// 		em.persist(p3);
// 		em.persist(p2);
// 		em.persist(p1);
// 		et.commit();
 		
 /*****************************************************************************/	
 		//save 4th person no aadhar
// 		
// 		Person p4 = new Person();
// 		
// 		p4.setPname("rakul");
// 		p4.setPcontact(977868676);
// 		
// 		et.begin();
// 		em.persist(p4);
// 		et.commit();
// 		
 	/**********************************************************************************/	
 		
 		//save new aadhar
 		
// 		Aadhar a4 = new Aadhar();
// 		a4.setAcontact(987668755);
// 		a4.setAaddress("salem");
// 		Person p = em.find(Person.class, 7);
// 		p.setPadhaar(a4);
// 		a4.setP(p);
// 		
// 		et.begin();
// 		em.persist(a4);
// 		et.commit();
 		
 	/*************************************************************************************/
 		
//    Person p2 = em.find(Person.class, 3);
//    Aadhar a2 = p2.getPadhaar();
//    a2.setAaddress("nagapattinam");
//    
//    et.begin();
//    em.merge(p2);
//    et.commit();
 		
 /*********************************************************************************************/		
 		Person p1 = em.find(Person.class, 1);
 		
 	    Aadhar a1 = p1.getPadhaar();
 	    p1.setPadhaar(null);
 	    
 	    et.begin();
 	    em.remove(a1);
 	    et.commit();
	}

}
