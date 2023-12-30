package manytoone_train_passenger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private long contact;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Train t;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Train getT() {
		return t;
	}

	public void setT(Train t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", contact=" + contact + ", t=" + t + "]";
	}
	
	

}
