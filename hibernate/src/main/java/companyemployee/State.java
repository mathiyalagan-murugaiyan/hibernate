package companyemployee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private String sname;
	
	private String sCapitalCity;
	
	@ManyToOne
	private Country country;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getsCapitalCity() {
		return sCapitalCity;
	}

	public void setsCapitalCity(String sCapitalCity) {
		this.sCapitalCity = sCapitalCity;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "State [sid=" + sid + ", sname=" + sname + ", sCapitalCity=" + sCapitalCity + ", country=" + country
				+ "]";
	}
	
	

}
