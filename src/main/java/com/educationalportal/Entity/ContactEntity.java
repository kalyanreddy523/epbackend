package com.educationalportal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long contactid;
	private String emailid;
	private String message;
	public long getContactid() {
		return contactid;
	}
	public void setContactid(long contactid) {
		this.contactid = contactid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ContactEntity(long contactid, String emailid, String message) {
		super();
		this.contactid = contactid;
		this.emailid = emailid;
		this.message = message;
	}
	public ContactEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ContactEntity [contactid=" + contactid + ", emailid=" + emailid + ", message=" + message + "]";
	}
	
	
	
}
