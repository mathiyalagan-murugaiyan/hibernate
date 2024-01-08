package companyemployee;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	private String cname;
	
	private int cNoState;
	
	private String capitalcity;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "country")
	List<State> states;

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

	public int getcNoState() {
		return cNoState;
	}

	public void setcNoState(int cNoState) {
		this.cNoState = cNoState;
	}

	public String getCapitalcity() {
		return capitalcity;
	}

	public void setCapitalcity(String capitalcity) {
		this.capitalcity = capitalcity;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", cNoState=" + cNoState + ", capitalcity=" + capitalcity
				+ ", states=" + states + "]";
	}
	
	 

}
