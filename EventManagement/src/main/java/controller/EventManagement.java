//package controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import com.google.protobuf.TextFormat.ParseException;
//
//import dao.AdminDao;
//import dao.ClientDao;
//import dao.ClientEventDao;
//import dao.ClientServiceDao;
//import dao.ServiceDao;
//import dto.Admin;
//import dto.Client;
//import dto.ClientEvent;
//import dto.ClientService;
//import dto.EventType;
//import dto.Service;
//
//public class EventManagement {
//
//		AdminDao adao=new AdminDao();
//		ServiceDao sdao=new ServiceDao();
//		ClientDao cdao=new ClientDao();
//		ClientEventDao cedao=new ClientEventDao();
//		ClientServiceDao csdao=new ClientServiceDao();
//		Scanner in = new Scanner(System.in);
//		
//		public static void main(String[] args) throws ParseException, java.text.ParseException {
//		
//			EventManagement em=new EventManagement();
//			//System.out.println(emt.saveService());
//			//em.saveAdmin();
//			//em.loginAdmin();
//			//em.saveService();
//			//em.updateService();
//			//em.deleteService();
//			//em.clientSignup();
//			//em.clientLogin();
//			em.createClientEvent();
//	}
//	
//	public Admin saveAdmin()
//	{
//		Admin admin=new Admin();
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter admin name");
//		admin.setAdminName(s.next());
//		System.out.println("Enter admin mail");
//		admin.setAdminMail(s.next());
//		System.out.println("Enter admin password");
//		admin.setAdminPassword(s.next());
//		System.out.println("Enter admin contact number");
//		admin.setAdminContact(s.nextLong());
//		
//		return adao.saveAdmin(admin);		
//	}
//	
//	public Admin loginAdmin()
//	{
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter Admin Email");
//		String email=s.next();
//		System.out.println("Enter Admin password");
//		String pass=s.next();
//		Query query=Persistence.createEntityManagerFactory("mathi").createEntityManager().createQuery("select a from Admin a where a.adminMail=?1");
//		query.setParameter(1, email);
//		Admin exadmin=(Admin) query.getSingleResult();
//	   if(exadmin!=null)
//	  {
//		  if(exadmin.getAdminPassword().equals(pass))
//		  {
//			  return exadmin;
//		  }
//		  return null;
//	  }
//	  return null;
//		
//	}
//	
//
//	public Service saveService() {
//	    Admin exAdmin = loginAdmin(); 
//	    if (exAdmin != null) {
//
//	        Service service = new Service();
//	        Scanner in = new Scanner(System.in);
//	        System.out.println("Enter the service name");
//	        service.setServicename(in.next());
//	        System.out.println("Enter Service cost per person");
//	        service.setServiceCostPerPerson(in.nextDouble());
//	        System.out.println("Enter the service cost per day");
//	        service.setServicecostPerDay(in.nextDouble());
//
//	        Service savedService = sdao.saveService(service);
//	        exAdmin.getServices().add(savedService);
//	        adao.updateAdmin(exAdmin, exAdmin.getAdminid());
//	        return savedService;
//
//	    }
//	    return null;
//	}
//	
//	
//	public List<Service> getAllService(){
//		
//	Admin exAdmin = loginAdmin();
//		
//		if(exAdmin != null) {
//		List<Service>servicelist=	exAdmin.getServices();
//		for(Service list :servicelist) {
//			
//			System.out.println("ServiceId" + "ServiceName" + " Cost per person" + "cost per day");
//			System.out.println(list.getServiceid() +" "+ list.getServicename() +" "+ list.getServiceCostPerPerson() + " "+ list.getServicecostPerDay());
//		}
//		
//		return  servicelist;
//		}
//		return null;
//	}
//	
//	public Service updateService() {
//		
//		getAllService();
//
//		Service service = sdao.findService(1);
//		
//		if(service != null) {
//		
//		System.out.println("Eter the service cost per person");
//		Double cost = in.nextDouble();
//		System.out.println("Enter the cost per day");
//		Double day = in.nextDouble();
//		
//		service.setServiceCostPerPerson(cost);
//		service.setServicecostPerDay(day);
//
//		 sdao.updateService(service, 1);
//		 
//		 return service;
//		} 
//		return null;
//	}
//	
//	public Service deleteService() {
//		
//	   
//	    Admin exAdmin = loginAdmin();
//	    if(exAdmin != null) {
//	    	
//	    	List<Service> services = exAdmin.getServices();
//	    	for(Service s : services) {
//	    		System.out.println("ServiceId" + "ServiceName" + " Cost per person" + "cost per day");
//	    		System.out.println(s.getServiceid() +" "+ s.getServicename() +" "+ s.getServiceCostPerPerson() + " "+ s.getServicecostPerDay());
//	    	}
//	    	
//	    	System.out.println("choose service id from above to update");
//	    	int id = in.nextInt();
//	    	Service tobeDeleted = sdao.findService(id);
//
//	    	if (tobeDeleted != null) {
//	            services.removeAll(services);
//	            exAdmin.setServices(services);
//	            System.out.println(services);
//	            adao.updateAdmin(exAdmin, exAdmin.getAdminid());
//	            sdao.deleteService(id);
//	            System.out.println("Service deleted successfully.");
//	            return tobeDeleted;
//	     }
//	    }
//	    return null;
//	   
//	
//	}
//	
//	public Client clientSignup() {
//		
//		Client client = new Client();
//		
//		System.out.println("Enter the client name");
//		client.setClientName(in.next());
//		System.out.println("Enter the client mail");
//		client.setClientMail(in.next());
//		System.out.println("Enter the Client Contact");
//		client.setClientContact(in.nextLong());
//		
//		return cdao.saveClient(client);
//	}
//	
//	public Client clientLogin() {
//		
//		System.out.println("Enter Client Name");
//		String name=in.next();
//		System.out.println("Enter Client Mail");
//		String mail =in.next();
//		Query query=Persistence.createEntityManagerFactory("mathi").createEntityManager().createQuery("select c from Client c where c.clientMail=?1");
//		query.setParameter(1, mail);
//		Client client=(Client) query.getSingleResult();
//		
//		if(client!=null)
//		  {
//			  if(client.getClientMail().equals(mail))
//			  {
//				  return client;
//			  }
//			  return null;
//		  }
//	   return null;
//	}
//	
//	public  ClientEvent createClientEvent() throws ParseException, java.text.ParseException {
//        ClientEvent clientevent = new ClientEvent();
//
//       
//        System.out.println("Enter the no of people");
//        clientevent.setClientEventNoOfPeople(in.nextInt());
//        System.out.println("Enter clientevent cost");
//        clientevent.setClientEventCost(in.nextDouble());
//        System.out.println("Enter no of days");
//        clientevent.setClientEventNoODays(in.nextInt());
//        System.out.println("Enter the Location");
//        clientevent.setClientEventLocation(in.next());
//        
//        System.out.println("Enter the start date (dd/MM/yyyy)");
//        String sDate1 = in.next();
//        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//        clientevent.setStartDate(date1);
//
//        System.out.println("Choose the event 1)Marrige , 2)Engagement, 3)BirthDay, 4)Anniversary, 5)babyShower,6)Reunion, 7)NamingCeremony,8)BachelorParty /$$$/ Enter 9 TO  Exit");
//       
//        int option = in.nextInt();
//        
//        Query query=Persistence.createEntityManagerFactory("mathi").createEntityManager().createQuery("select s from Service s ");
//	
//	     
//        @SuppressWarnings("unchecked")
//		List<Service> services = query.getResultList();
//		
//        
//        switch(option) {
//        case 1 :
//        	clientevent.setEventType(EventType.Marrige);
//        	for(Service s : services ) {
//        		System.out.println("ServiceId" + "ServiceName" + " Cost per person" + "cost per day");
//	    		System.out.println(s.getServiceid() +" "+ s.getServicename() +" "+ s.getServiceCostPerPerson() + " "+ s.getServicecostPerDay());
//        	}
//        	
//        	@SuppressWarnings("unchecked") List<ClientEvent> s1 =  query.getResultList();
//        	List<ClientService> service = query.getResultList();
//        	clientevent.setClientservices(s1);
//        	
//        	
//        	
//        	
//        	System.out.println("services");
//        	break;
//        case 2:
//        	clientevent.setEventType(EventType.Engagement);
//        	break;
//        case 3:
//        	clientevent.setEventType(EventType.BirthDay);
//        	break;
//        case 4:
//        	clientevent.setEventType(EventType.Anniversary);
//        	break;
//        case 5:
//        	clientevent.setEventType(EventType.babyShower);
//        	break;
//        case 6:
//        	clientevent.setEventType(EventType.Reunion);
//        	break;
//        case 7:
//        	clientevent.setEventType(EventType.NamingCeremony);
//        	break;
//        case 8:
//        	clientevent.setEventType(EventType.BachelorParty);
//        	break;
//        	
//        case 9:
//        	System.exit(0);
//        	break;
//  
//        }
//        
//return null;	
//}
//	
//
//}

package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dao.AdminDao;
import dao.ClientDao;
import dao.ClientEventDao;
import dao.ClientServiceDao;
import dao.ServiceDao;
import dto.Admin;
import dto.Client;
import dto.ClientEvent;
import dto.ClientService;
import dto.EventType;
import dto.Service;

public class EventManagement 
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	AdminDao adao = new AdminDao();
	ServiceDao sdao = new ServiceDao();
	ClientDao cdao = new ClientDao();
	ClientEventDao ceDao = new ClientEventDao();
	ClientServiceDao csDao = new ClientServiceDao();
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		EventManagement em = new EventManagement();
    //	System.out.println(em.saveAdmin());
	//	System.out.println(em.saveService());
	//	System.out.println(em.updateService()); 
	//  System.out.println(em.deleteService());	
	//	System.out.println(em.signupClient());
	//	System.out.println(em.createClientEvent());
	//	System.out.println(em.saveClientService());
		System.out.println(em.removeEventService());
		
	}
	
	public Admin adminLogin()
	{
		System.out.println("Enter the Admin email:");
		String email = sc.next();
		System.out.println("Enter the Admin Password");
		String password = sc.next();
		
		String jpql = "select a from Admin a";
		Query query = em.createQuery(jpql);
		
		List<Admin> admins = (List<Admin>) query.getResultList();
		for(Admin a : admins)
		{
			if(a.getAdminMail().equals(email))
			{
				return a;
			}
		}
		return null;
	}
	
	public Admin saveAdmin()
	{
		System.out.println("---------------------- SIGNUP ADMIN ----------------------");
		Admin admin = new Admin();
		System.out.println("Enter the Admin name:");
		admin.setAdminName(sc.next()); 
		System.out.println("Enter the Admin email:");
		admin.setAdminMail(sc.next());
		System.out.println("Enter the Admin password:");
		admin.setAdminPassword(sc.next());
		System.out.println("Enter the Admin contact number:");
		admin.setAdminContact(sc.nextLong());
		
		Admin newAdmin = adao.saveAdmin(admin);
		if(newAdmin != null)
		{
			System.err.println("You are a new Admin..!");	
		}
		else
			System.err.println("try again!");
		
		return newAdmin;
	}
	
	public Service saveService()
	{
		System.out.println("---------------------- ADD SERVICES ----------------------");
		Service service = new Service();
		System.out.println(("Enter the Service name:"));
		service.setServicename(sc.next());
		System.out.println(("Enter the Service cost per day:"));
		service.setServicecostPerDay(sc.nextDouble());
		System.out.println(("Enter the Service cost per person:"));
		service.setServiceCostPerPerson(sc.nextDouble());
		
		Service newService =  sdao.saveService(service);
		if(newService != null)
		{
			System.err.println("Service added successfully...");
			
			System.err.println("If you want to add more services press 1!");
			int num = sc.nextInt();
			
			if(num == 1)
			{
				saveService();
			}
			else
				return newService;
		}
		else
			System.err.println("Service added failed...");
		
		return newService;
	}
	
	public List<Service> getAllServices()
	{
			Query query = em.createQuery("select s from Service s");
			List<Service> services = (List<Service>) query.getResultList();
			if(services != null)
			{
				return services;
			}
			return null;
	}
	
	public String updateService()
	{
		System.out.println("Enter Admin credentials to proceed....!");
		Admin exAdmin = adminLogin();
		
		if(exAdmin != null)
		{
			List<Service> services = getAllServices();
			
			System.out.println("------------------------- Choose serviceId from below to update -------------------------");
			System.out.println();
			System.out.println("serviceId     "+"serviceName     "+"cost_per_person     "+"cost_per_day");
			for(Service s : services)
			{
				System.out.println("  "+s.getServiceid()+"          "+s.getServicename()+"          "+s.getServiceCostPerPerson()+"          "+s.getServicecostPerDay());
			}
				int id = sc.nextInt();
				Service toUpdated = sdao.findService(id);
				System.out.println("Enter updated cost per person");
				double costPerPerson = sc.nextDouble();
				System.out.println("Enter updated cost per day");
				double costPerDay = sc.nextDouble();
				toUpdated.setServiceCostPerPerson(costPerPerson);
				toUpdated.setServicecostPerDay(costPerDay);
				
				Service updated = sdao.updateService(toUpdated, id);
				if(updated != null)
				{
					return "Service update success....!";
				}
		}
		return  "Service update failed....!";	
	}
	
	public String deleteService()
	{
		System.out.println("Enter Admin credentials to proceed....!");
		Admin exAdmin = adminLogin();
		
		if(exAdmin != null)
		{
			List<Service> services = getAllServices();
			System.out.println("------------------------- Choose serviceId from below to delete -------------------------");
			System.out.println();
			
			System.out.println("serviceId     "+"serviceName     "+"cost_per_person     "+"cost_per_day");
			for(Service s : services)
			{
				System.out.println("  "+s.getServiceid()+"          "+s.getServicename()+"          "+s.getServiceCostPerPerson()+"          "+s.getServicecostPerDay());
			}
			
			int id = sc.nextInt();
			
			List<Service> newList = new ArrayList<Service>();
			
			for(Service s : services)
			{
				if(s.getServiceid() != id)
				{
					newList.add(s);
				}
			}
			
			exAdmin.setServices(newList);
			adao.updateAdmin(exAdmin, exAdmin.getAdminid());
		    Service deleted = sdao.deleteService(id);	
		    
		    if(deleted != null)
		    {
		    	return "Service deleted success....";
		    }
		}
		return "Service deleted failed....";
		
	}
	
	public Client signupClient()
	{
		System.out.println("-------------------------- CLIENT SIGNUP --------------------------");
		Client client = new Client();
		System.out.println("Enter the name:");
		client.setClientName(sc.next());
		System.out.println("Enter the contact:");
		client.setClientContact(sc.nextLong());
		System.out.println("Enter the email:");
		client.setClientMail(sc.next());
		System.out.println("Enter the password");
		client.setPassword(sc.next());
		Client newClient = cdao.saveClient(client);
		
		if(newClient != null)
		{
			System.err.println("Signup success..!");
		}
		else
			System.err.println("Signup failed..!");
		
		return newClient;
	}
	
	
	public Client loginClient()
	{
		System.out.println("-------------------------- CLIENT LOGIN --------------------------");
		System.out.println("Enter the email:");
		String email = sc.next();
		System.out.println("Enter the password:");
		String password = sc.next();
		
		String jpql = "select c from Client c";
		Query query = em.createQuery(jpql);
		
		List<Client> clients = (List<Client>) query.getResultList();
		
		for(Client c : clients)
		{
			if(c.getClientMail().equals(email))
			{
				return c;
			}
		}
		return null;
	}
	
	public Client createClientEvent()
	{
		System.out.println("-------------------------- CREATE YOUR EVENTS HERE --------------------------");
		Client client = loginClient();
		
		if(client != null)
		{
			ClientEvent clientEvent = new ClientEvent();
			System.out.println("Choose the event:");
			
			EventType eventType[] = EventType.values();
			int i = 1;
			for(EventType et : eventType)
			{
				System.out.println(i++ +"."+ et);
			}
			
			int e = sc.nextInt();
			if(e == 1)
			{
				clientEvent.setEventType(EventType.Engagement);
			}
			if(e == 2)
			{
				clientEvent.setEventType(EventType.Engagement);
			}
			if(e == 3)
			{
				clientEvent.setEventType(EventType.BirthDay);
			}
			if(e == 4)
			{
				clientEvent.setEventType(EventType.BachelorParty);
			}
			if(e == 5)
			{
				clientEvent.setEventType(EventType.NamingCeremony);
			}
			if(e == 6)
			{
				clientEvent.setEventType(EventType.Engagement);
			}
			if(e == 7)
			{
				clientEvent.setEventType(EventType.BachelorParty);
			}
			if(e == 8)
			{
				clientEvent.setEventType(EventType.Reunion);
			}
			if(e == 9)
			{
				clientEvent.setEventType(EventType.babyShower);
			}
			if(e == 10)
			{
				clientEvent.setEventType(EventType.NamingCeremony);
			}
			
			System.out.println("Enter number of people:");
			clientEvent.setClientEventNoOfPeople(sc.nextInt());
			System.out.println("Enter number of days:");
			clientEvent.setClientEventNoODays(sc.nextInt());
			System.out.println("Enter the event location:");
			clientEvent.setClientEventLocation(sc.next());
			
			ClientEvent savedClientEvent = ceDao.saveClientEvent(clientEvent);
			
			clientEvent.setClient(client);
			client.getEvents().add(savedClientEvent);
			Client c = cdao.updateClient(client, client.getClientid());
			if(c != null)
			{
				System.err.println("your event successfully created...!");
			}
			else
				System.err.println("Event created failed...!");
			
			return c;
		}
		return null;	
	}
	
	public Client saveClientService()
	{
		Client client = loginClient();
		
		if(client != null)
		{
			List<Service> adminServices = getAllServices(); 
			System.out.println("------------------------- A to Z services -------------------------");
	        System.out.println();
			
			System.out.println("serviceId     "+"serviceName     "+"cost_per_person     "+"cost_per_day");
			for(Service s : adminServices)
			{
				System.out.println("  "+s.getServiceid()+"          "+s.getServicename()+"          "+s.getServiceCostPerPerson()+"          "+s.getServicecostPerDay());
			}
			System.err.println("How many services are you want from above services?");
			int noOfServices = sc.nextInt();
			System.err.println("You're selected "+noOfServices+" services..!");
			
			List<Service> clientServices = new ArrayList<>();
			
			for(int j=1;j<=noOfServices;j++)
			{
				System.err.println("Confirm your service-"+j+" to enter the service number from above services");
				int id = sc.nextInt();
				
				Service service = sdao.findService(id);
				
				Query query = em.createQuery("select ce from ClientEvent ce");
				List<ClientEvent> clientEvents = (List<ClientEvent>) query.getResultList();
				
				ClientService clientService = new ClientService();
				for(ClientEvent clientEvent : clientEvents)
				{
					if(clientEvent.getClient().getClientid() == (client.getClientid()))
					{
						clientService.setClientServiceName(service.getServicename());
						clientService.setClientCostPerPerson(service.getServiceCostPerPerson());
						clientService.setClientServiceNoOfDays(clientEvent.getClientEventNoODays());
						double totalCostOfAllPeoples = clientEvent.getClientEventNoOfPeople()*service.getServiceCostPerPerson();
						double totalCostOfAllDays = clientEvent.getClientEventNoODays()*service.getServicecostPerDay();
						clientService.setClientServiceCost(totalCostOfAllPeoples+totalCostOfAllDays);
						clientServices.add(service);
						csDao.saveClientService(clientService);
						double clientEventCost = clientEvent.getClientEventCost()+clientService.getClientServiceCost();
						clientEvent.setClientEventCost(clientEventCost);						
						ceDao.updateClientEvent(clientEvent, clientEvent.getClientEventId());
					}
				}
			}
			return client;
		}
		return null;
	}
	
	public ClientService removeEventService()
	{
		Client client = loginClient();
		
		if(client != null)
		{
			Query query = em.createQuery("select ce from ClientEvent ce");
			List<ClientEvent> clientEvents = (List<ClientEvent>) query.getResultList();
			
			for(ClientEvent ce : clientEvents)
			{
				if(ce.getClient().getClientid() == client.getClientid())
				{
					List<ClientService> clientServices = (List<ClientService>) ce.getClientservices();
					
					System.out.println("------------------------- Choose serviceId from below to delete -------------------------");
					System.out.println("ServiceId      "+" ServiceName");
					for(ClientService cs : clientServices)
					{
						System.out.println("       "+cs.getClientServiceId()+"       "+cs.getClientServiceName());
					}
					
					int id = sc.nextInt();
					
					for(ClientService cs : clientServices)
					{
						if(cs.getClientServiceId() == id)
						{
							ClientService deleted = csDao.deleteClientService(cs.getClientServiceId());
							if(deleted != null)
							{
								System.err.println("service removed successfully..!");
							}
							else
								System.err.println("service removed failed..!");
							
							return deleted; 
						}
					}
				}
			}
		}
		return null;
	}
	
	
	
}
