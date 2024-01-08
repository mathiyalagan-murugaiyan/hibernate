package personAadhar_OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int pid;
    private String pname;
    private long pcontact;
    @OneToOne(cascade = CascadeType.ALL)
    private Aadhar padhaar;
      
	public Aadhar getPadhaar() {
		return padhaar;
	}
	public void setPadhaar(Aadhar padhaar) {
		this.padhaar = padhaar;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPcontact() {
		return pcontact;
	}
	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pcontact=" + pcontact + "]";
	}
	
    
}
