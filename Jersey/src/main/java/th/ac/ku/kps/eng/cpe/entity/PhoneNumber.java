package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;

public class PhoneNumber implements Serializable {
	private String number;
	
	public PhoneNumber(String number) {
		this.number = number;
	}
}
