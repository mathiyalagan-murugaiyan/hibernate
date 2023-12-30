package manytoone_train_passenger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
		
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mathi");
 		EntityManager em=emf.createEntityManager();
 		EntityTransaction et=em.getTransaction();
 		
// 		Train t = new Train();
// 		
// 		t.setTname("chennai express");
// 		t.setNoOfCoches(20);
// 		t.settrainFrom("bangalore");
// 		t.settrainTo("chennai");
// 		
// 		
// 		Passenger p1 = new Passenger();
// 		p1.setName("chandran");
// 		p1.setContact(987654324);
// 		p1.setT(t);
// 		
// 		
// 		Passenger p2 = new Passenger();
// 		p2.setName("raja");
// 		p2.setContact(938735363);
// 		p2.setT(t);
// 		
// 		Passenger p3 = new Passenger();
// 		p3.setName("ram");
// 		p3.setContact(937353563);
// 		p3.setT(t);
// 		
// 		
// 		et.begin();
// 		em.persist(p3);
// 		em.persist(p2);
// 		em.persist(p1);
// 		et.commit();

 		/***************************************************************************************************/
 		
//        Train t1 = new Train();
// 		
// 		t1.setTname("tarin1");
// 		t1.setNoOfCoches(20);
// 		t1.settrainFrom("chennai");
// 		t1.settrainTo("kumbakonam");
// 		
// 		Train t2 = new Train();
// 		t2.setTname("train2");
// 		t2.setNoOfCoches(20);
// 		t2.settrainFrom("kumbakonam");
// 		t2.settrainTo("trichy");
// 		
// 		et.begin();
// 		em.persist(t1);
// 		em.persist(t2);
// 		et.commit();
 		
 	/*************************************************************************************************************/
 	
 		
//   PassengerDao train = new PassengerDao();		
// 	Passenger p1 = new Passenger();
// 	p1.setName("jack");
// 	p1.setContact(938365354);
// 	p1.setT(train.findByTrain(1));
// 	
// 	Passenger p2 = new Passenger();
// 	p2.setContact(934746454);
// 	p2.setName("arun");
// 	p2.setT(train.findByTrain(1));
// 	
// 	Passenger p3 = new Passenger();
// 	p3.setName("mani");
// 	p3.setContact(948464654);
// 	p3.setT(train.findByTrain(1));
// 	
// 	Passenger p4 = new Passenger();
// 	p4.setName("vijay");
// 	p4.setContact(938367353);
// 	p4.setT(train.findByTrain(1));
// 	
// 	et.begin();
// 	em.merge(p4);
// 	em.merge(p3);
// 	em.merge(p2);
// 	em.merge(p1);
// 	et.commit();
 
 /****************************************************************************************************************/
 		
 		
// 		PassengerDao train = new PassengerDao();
// 		Passenger p4 = train.findById(4);
// 		Train t = train.findByTrain(2);
// 		
// 		p4.setT(t);
// 		et.begin();
// 		em.merge(p4);
// 		et.commit();
 /********************************************************************************************************************/		
 		
// 		PassengerDao train = new PassengerDao();
// 		Passenger p5 = new Passenger();
// 		p5.setName("ram");
// 		p5.setContact(847454537);
// 		p5.setT(train.findByTrain(2));
// 		
// 		Passenger p6 = new Passenger();
// 		p6.setName("saran");
// 		p6.setContact(847454434);
// 		p6.setT(train.findByTrain(2));
// 		
// 		et.begin();
// 		em.merge(p6);
// 		em.merge(p5);
// 		et.commit();
 		
 		/*************************************************************************************/
 		
 		PassengerDao train = new PassengerDao();
 		train.deleteByTrain(1);
 		
 		
 		
	}

}
