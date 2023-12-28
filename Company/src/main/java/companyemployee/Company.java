package companyemployee;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	private String cname;
	
	private String caddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> ems;

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", ems=" + ems + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public List<Employee> getEms() {
		return ems;
	}

	public void setEms(List<Employee> ems) {
		this.ems = ems;
	}
	
	

}
