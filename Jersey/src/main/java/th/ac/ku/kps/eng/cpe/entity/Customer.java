package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
	private String name;
	private ArrayList<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	
	public Customer() {
		
	}
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers ;
	}

	public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	

}
