package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Admin;

public class AdminDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mathi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	public Admin saveAdmin(Admin admin) {
		
		et.begin();
		em.persist(admin);
		et.commit();
		return admin;
		
	}
	public Admin findAdmin(int adminid) {
		Admin admin = em.find(Admin.class,adminid);
		
		if(admin!= null) {
			
			return admin;
		}
		return null;
	}
	
	public Admin updateAdmin(Admin admin , int id) {
		
		Admin exadmin = em.find(Admin.class, id);
		if(exadmin != null){
			admin.setAdminid(id);
			et.begin();
			em.merge(admin);
			et.commit();
			return exadmin;
			
		}
		else {
			et.rollback();
		}
		return null;
		
	}
	
	public Admin deleteAdmin(int id) {
		
		Admin admin= em.find(Admin.class, id);
		
		
		
			et.begin();
			em.remove(admin);
			et.commit();
			return admin;
		
		
	}

}
