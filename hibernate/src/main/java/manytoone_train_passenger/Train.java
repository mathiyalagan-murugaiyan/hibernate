package manytoone_train_passenger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String  tname;
	
	private int noOfCoches;
	
	private String trainFrom;
	
	private String trainTo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getNoOfCoches() {
		return noOfCoches;
	}

	public void setNoOfCoches(int noOfCoches) {
		this.noOfCoches = noOfCoches;
	}

	public String gettrainFrom() {
		return trainFrom;
	}

	public void settrainFrom(String trainFrom) {
		this.trainFrom = trainFrom;
	}

	public String gettrainTo() {
		return trainTo;
	}

	public void settrainTo(String trainTo) {
		this.trainTo = trainTo;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", tname=" + tname + ", noOfCoches=" + noOfCoches + ", trainFrom=" + trainFrom
				+ ", trainTo=" + trainTo + "]";
	}


	
	
}
