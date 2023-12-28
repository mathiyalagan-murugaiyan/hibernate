package companyemployee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	private String ename;
	
	private String eEmail;
	
	private Long contact;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(long i) {
		this.contact = i;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eEmail=" + eEmail + ", contact=" + contact + "]";
	}
	
	

}
