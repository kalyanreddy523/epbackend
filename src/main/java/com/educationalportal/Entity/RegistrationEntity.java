package com.educationalportal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistrationEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String email;
	private String password;
	private String fullname;
	private String adress;
	private String landmark;
	private String city;
	private String state;
	private String pincode;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public RegistrationEntity(long id, String email, String password, String fullname, String adress, String landmark,
			String city, String state, String pincode) {
		super();
		Id = id;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.adress = adress;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public RegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegistrationEntity [Id=" + Id + ", email=" + email + ", password=" + password + ", fullname=" + fullname
				+ ", adress=" + adress + ", landmark=" + landmark + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
		
}
