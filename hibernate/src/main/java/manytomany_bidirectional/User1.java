package manytomany_bidirectional;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Cacheable
@Table(name ="User_table")
public class User1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	
	private String uname;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "userlist")
	private List<Application1> applist;

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

	public List<Application1> getApplist() {
		return applist;
	}

	public void setApplist(List<Application1> applist) {
		this.applist = applist;
	}

	@Override
	public String toString() {
		return "User1 [uid=" + uid + ", uname=" + uname + "]";
	}
	
	
	

}
