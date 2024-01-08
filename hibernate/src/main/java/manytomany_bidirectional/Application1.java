package manytomany_bidirectional;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Application_table")
public class Application1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	
	private String aname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "application_user_table")
	private List<User1> userlist;

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

	public List<User1> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User1> userlist) {
		this.userlist = userlist;
	}

	@Override
	public String toString() {
		return "Application1 [aid=" + aid + ", aname=" + aname + ", userlist=" + userlist + "]";
	}
	
	
	
	

}
