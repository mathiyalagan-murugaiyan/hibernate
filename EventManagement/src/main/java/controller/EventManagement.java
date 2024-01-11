package controller;

import java.util.Scanner;

import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.AdminDao;
import dao.ClientDao;
import dao.ClientEventDao;
import dao.ClientServiceDao;
import dao.ServiceDao;
import dto.Admin;
import dto.Service;

public class EventManagement {

		AdminDao adao=new AdminDao();
		ServiceDao sdao=new ServiceDao();
		ClientDao cdao=new ClientDao();
		ClientEventDao cedao=new ClientEventDao();
		ClientServiceDao csdao=new ClientServiceDao();
		
		
		public static void main(String[] args) {
		
			EventManagement em=new EventManagement();
			//System.out.println(emt.saveService());
			
			//em.loginAdmin();
			em.saveService();
	}
	
	public Admin saveAdmin()
	{
		Admin admin=new Admin();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter admin name");
		admin.setAdminName(s.next());
		System.out.println("Enter admin mail");
		admin.setAdminMail(s.next());
		System.out.println("Enter admin password");
		admin.setAdminPassword(s.next());
		System.out.println("Enter admin contact number");
		admin.setAdminContact(s.nextLong());
		
		return adao.saveAdmin(admin);		
	}
	
	public Admin loginAdmin()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter email");
		String email=s.next();
		System.out.println("enter password");
		String pass=s.next();
		Query query=Persistence.createEntityManagerFactory("mathi").createEntityManager().createQuery("select a from Admin a where a.adminMail=?1");
		query.setParameter(1, email);
		Admin exadmin=(Admin) query.getSingleResult();
	   if(exadmin!=null)
	  {
		  if(exadmin.getAdminPassword().equals(pass))
		  {
			  return exadmin;
		  }
		  return null;
	  }
	  return null;
		
	}
	

	public Service saveService() {
	    Admin exAdmin = loginAdmin(); 
	    if (exAdmin != null) {

	        Service service = new Service();
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the service name");
	        service.setServicename(in.next());
	        System.out.println("Enter Service cost per person");
	        service.setServiceCostPerPerson(in.nextDouble());
	        System.out.println("Enter the service cost per day");
	        service.setServicecostPerDay(in.nextDouble());

	        Service savedService = sdao.saveService(service);
	        exAdmin.getServices().add(savedService);
	        adao.updateAdmin(exAdmin, exAdmin.getAdminid());
	        return savedService;

	    }
	    return null;
	}

}

