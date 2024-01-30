package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;

public class PhoneNumber implements Serializable {
	private String number;
	public PhoneNumber() {
		
	}
	public PhoneNumber(String number) {
		this.number = number;
	}
	public String getPhoneNumber() {
		return number;
	}
	public void setPhoneNumber(String number) {
		this.number = number;
	}
}
