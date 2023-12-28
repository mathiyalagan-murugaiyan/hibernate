package companyemployee;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
	

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
//		
//		Employee e1 = new Employee();
//		e1.setEname("jaya chandran");
//		e1.seteEmail("chandran@gmail.com");
//		e1.setContact(123456789);
//		
//		Employee e2 = new Employee();
//		
//		e2.setEname("ram");
//		e2.seteEmail("ram@gmail.com");
//		e2.setContact(987654323);
//		
//	
//		List<Employee> employees = new ArrayList< Employee>();
//		
//		employees.add(e1);
//		employees.add(e2);
//		
//		Company c = new Company();
//		
//		c.setCname("xyz");
//		c.setCaddress("chennai");
//		c.setEms(employees);
//		
//		
//		et.begin();
//		em.persist(c);
//		et.commit();
		
	
	
//      CompanyDao cdao = new CompanyDao();
//      cdao.deleteEmp(1);
//      
//      EmployeeDao edao = new EmployeeDao();
//      edao.find(1);
//		
/**********************************************************************************/		
//		Employee e1 = new Employee();
//		e1.setEname("raja");
//		e1.seteEmail("ram@gmail.com");
//		e1.setContact(987654321);
//		
//		Employee e2 = new Employee();
//		e2.setEname("chandran");
//		e2.seteEmail("chandran@gmail.com");
//		e2.setContact(123456789);
//		
//		List<Employee> employee = new ArrayList<Employee>();
//		employee.add(e1);
//		employee.add(e2);
//		
//		
//		
//		Company c1 = new Company();
//		c1.setCname("xyz");
//		c1.setCaddress("chennai");
//		c1.setEms(employee);
//		
//		
//		
//		et.begin();
//		em.persist(c1);
//		et.commit();
		/******************************************************************************************/
//		Company c2 = new Company();
//		c2.setCname("abc");
//		c2.setCaddress("trichy");
//		
//		et.begin();
//		em.persist(c2);
//		et.commit();
		
/****************************************************************************************************/
//		Employee e3 = new Employee();
//		e3.setEname("ragu");
//		e3.seteEmail("ragu@gmail.com");
//		e3.setContact(123456789);
//		
//		Employee e4 = new Employee();
//		
//		e4.setEname("arun");
//		e4.seteEmail("arun@gmail.com");
//		e4.setContact(987654323);
//		
//		Employee e5 = new Employee();
//		
//		e5.setEname("mani");
//		e5.seteEmail("mani@gmail.com");
//		e5.setContact(987654323);
//		
//		Employee e6 = new Employee();
//		
//		e6.setEname("guna");
//		e6.seteEmail("guna@gmail.com");
//		e6.setContact(987654323);
//		
//		List<Employee> employee = new ArrayList<Employee>();
//		employee.add(e3);
//		employee.add(e4);
//		employee.add(e5);
//		employee.add(e6);
//		et.begin();
//		em.persist(e3);
//		em.persist(e4);
//		em.persist(e5);
//		em.persist(e6);
//		et.commit();
		
/*********************************************************************************/
		Company c2 = em.find(Company.class, 2);
		List<Employee> e = c2.getEms();
       e.add(findById(3));
		e.add(findById(4));
		c2.setEms(e);
		et.begin();
		em.merge(c2);
		et.commit();
		
	}
	
	public  static Employee findById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");

		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Employee e = em.find(Employee.class , id);
		if(e != null) {
			et.begin();
			em.persist(e);
			et.commit();
			return e;
		}
		return null;
}
	

}
