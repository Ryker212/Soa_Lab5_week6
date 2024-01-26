package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
	private String name;
	private ArrayList<PhoneNumber> phonenumbers;
	
	public Customer(String name) {
		this.name = name;
	}
	public String getCustomer() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
