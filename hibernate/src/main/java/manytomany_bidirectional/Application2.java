package manytomany_bidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Application_demo")
public class Application2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "app_id")
	private int aid; 
	
	@Column(name ="app_name" ,nullable =false)
	private String aname;
	
	@Column(name="app_price",nullable = false)
	private int aprice;

}
