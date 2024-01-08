package manyToOne_Bidirectional;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Controller {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//save 2 projects with 4 students each
		
//		Project p1 = new Project();
//		p1.setPname("Student Management System");
//		p1.setPduration(3);
//		p1.setStudents(null);
//		
//		
//		Student1 s1 = new Student1();
//		s1.setSname("dinedh");
//		s1.setEmail("dinesh@gmail.com");
//		s1.setSphone(947846453);
//		s1.setProject(p1);
//
//		Student1 s2 = new Student1();
//		s2.setSname("ram");
//		s2.setEmail("ram@gmail.com");
//		s2.setSphone(947846563);
//		s2.setProject(p1);
//
//		Student1 s3 = new Student1();
//		s3.setSname("arun");
//		s3.setEmail("arun@gmail.com");
//		s3.setSphone(94489534);
//		s3.setProject(p1);
//		
//		Student1 s4 = new Student1();
//		s4.setSname("mani");
//		s4.setEmail("mani@gmail.com");
//		s4.setSphone(834746464);
//		s4.setProject(p1);
//		
 //       ArrayList<Student1> list1 = new ArrayList<Student1>();
//		list1.add(s1);
//		list1.add(s2);
//		list1.add(s3);
//		list1.add(s4);
//		p1.setStudents(list1);
//		
//		
//		Project p2 = new Project();
//		p2.setPname("library Management system");
//		p2.setPduration(4);
//		
//		Student1 s5 = new Student1();
//		s5.setSname("selvam");
//		s5.setEmail("selvam@gmail.com");
//		s5.setSphone(834343434);
//		s5.setProject(p2);
//		
//		Student1 s6 = new Student1();
//		s6.setSname("siva");
//		s6.setEmail("siav@gmail.com");
//		s6.setSphone(836976874);
//		s6.setProject(p2);
//		
//		Student1 s7 = new Student1();
//		s7.setSname("hari");
//		s7.setEmail("hari@gmail.com");
//		s7.setSphone(846746464);
//		s7.setProject(p2);
//		
//		Student1 s8 = new Student1();
//		s8.setSname("rakul");
//		s8.setEmail("rakul@gmail.com");
//		s8.setSphone(834745344);
//		s8.setProject(p2);
//		
//	ArrayList<Student1> list2 = new ArrayList<Student1>();
//		list2.add(s5);
//		list2.add(s6);
//		list2.add(s7);
//		list2.add(s8);
//		p2.setStudents(list2);
//		
//		
//		et.begin();
//		em.persist(p1);
//		em.persist(p2);
//		et.commit();
		
		
	/**************************************************************************************/
		
		//add 2 students
		
//		Student1 s9 = new Student1();
//		s9.setSname("kaml");
//		s9.setEmail("kamal@gmail.com");
//		s9.setSphone(83937836);
//		
//		Student1 s10 = new Student1();
//		s10.setSname("vijay");
//		s10.setEmail("vijay@gmail.com");
//		s10.setSphone(83937836);
//		
//		et.begin();
//		em.persist(s9);
//		em.persist(s10);
//		et.commit();
//		
		
		//add std 9 to project 1 and std10 to project 2
		
     
//		Student1 s9 = em.find(Student1.class, 9);
//		Project p1 = em.find(Project.class, 1);
//		 List <Student1>list3 = p1.getStudents();
//        list3.add(s9);
//        s9.setProject(p1);
//
//		Student1 s10 = em.find(Student1.class, 10);
//		Project p2 = em.find(Project.class, 2);
//		s10.setProject(p2);
//		 List <Student1>list4 = p2.getStudents();
//		 list4.add(s10);
//		 s10.setProject(p2);
//		
//		et.begin();
//		em.merge(p1);
//		em.merge(p2);
//		et.commit();
		
		//
		
		Project p3 = new Project();
		p3.setPname("ticket booking");
		p3.setPduration(3);
		
		Project p1 = em.find(Project.class, 1);
		List<Student1> list =p1.getStudents();
		for(Student1 s : list) {
		      System.out.println(s);
		     
		}
		
		
		
		
		
	}

}
