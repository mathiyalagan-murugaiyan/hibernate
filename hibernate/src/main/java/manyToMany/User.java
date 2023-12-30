package manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	private String uname;
	
	private long ucontact;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Application> apps;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public long getUcontact() {
		return ucontact;
	}

	public void setUcontact(long ucontact) {
		this.ucontact = ucontact;
	}

	public List<Application> getApps() {
		return apps;
	}

	public void setApps(List<Application> apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", ucontact=" + ucontact + ", apps=" + apps + "]";
	}
	
	
}
