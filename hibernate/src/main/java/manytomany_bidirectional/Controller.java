package manytomany_bidirectional;

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
	 		EntityManager em1=emf.createEntityManager();
	 		EntityManager em2=emf.createEntityManager();
		
		
//		Application1 app1 = new Application1();
//		app1.setAname("netflix");
//		
//		Application1 app2 = new Application1();
//		app2.setAname("instagram");
//		
//		Application1 app3 = new Application1();
//		app3.setAname("chrome");
//		
//		Application1 app4 = new Application1();
//		app4.setAname("snapchat");
//		
//		
//		User1 user1= new User1();
//		user1.setUname("jayaram");
//		
//		User1 user2= new User1();
//		user2.setUname("maharaja");
//		
//		User1 user3= new User1();
//		user3.setUname("prakash");
//		
//		List<Application1> applist1= new ArrayList<Application1>();
//		applist1.add(app3);
//		user1.setApplist(applist1);
//		
//		List<Application1> applist2= new ArrayList<Application1>();
//		applist2.add(app1);
//		applist2.add(app2);
//		applist2.add(app3);
//		user2.setApplist(applist2);
//		
//		List<Application1> applist3= new ArrayList<Application1>();
//		applist3.add(app1);
//		applist3.add(app2);
//		applist3.add(app4);
//		user3.setApplist(applist3);
//		
//		List<User1> userlist1 = new ArrayList<User1>();
//		userlist1.add(user2);
//		userlist1.add(user3);
//		app1.setUserlist(userlist1);
//		
//		List<User1> userlist2 = new ArrayList<User1>();
//		userlist2.add(user2);
//		userlist2.add(user3);
//		app2.setUserlist(userlist2);
//		
//		List<User1> userlist3 = new ArrayList<User1>();
//		userlist3.add(user1);
//		userlist3.add(user2);
//		app3.setUserlist(userlist3);
//		
//		List<User1> userlist4 = new ArrayList<User1>();
//		userlist4.add(user3);
//		app4.setUserlist(userlist4);
//		
//		et.begin();
//		em.persist(app4);
//		et.commit();
//	
	 		
	 		em.find(User1.class, 1);
	 		em.find(User1.class, 1);
	 		em.find(User1.class, 2);
	 		em1.find(User1.class, 2);
	 		em2.find(User1.class, 3);
	}

}
