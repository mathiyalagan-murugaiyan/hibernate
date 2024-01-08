package personAadhar_OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
   private int aid;
   private String aaddress;
   private long acontact;
   @OneToOne
   private Person p;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public Person getP() {
	return p;
}
public void setP(Person p) {
	this.p = p;
}
public String getAaddress() {
	return aaddress;
}
public void setAaddress(String aaddress) {
	this.aaddress = aaddress;
}
public long getAcontact() {
	return acontact;
}
public void setAcontact(long acontact) {
	this.acontact = acontact;
}
@Override
public String toString() {
	return "Adhaar [aid=" + aid + ", aaddress=" + aaddress + ", acontact=" + acontact + "]";
}
   
   
}
