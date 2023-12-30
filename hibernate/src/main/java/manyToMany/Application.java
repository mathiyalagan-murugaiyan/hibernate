package manyToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	
	private String aname;
	
	private int aCost;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getaCost() {
		return aCost;
	}

	public void setaCost(int aCost) {
		this.aCost = aCost;
	}

	@Override
	public String toString() {
		return "Application [aid=" + aid + ", aname=" + aname + ", aCost=" + aCost + "]";
	}
	
	

}
