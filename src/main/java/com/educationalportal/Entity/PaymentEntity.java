package com.educationalportal.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String customerid;
	private String course;
	private String status;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PaymentEntity(long id, String customerid, String course, String status) {
		super();
		Id = id;
		this.customerid = customerid;
		this.course = course;
		this.status = status;
	}
	public PaymentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PaymentEntity [Id=" + Id + ", customerid=" + customerid + ", course=" + course + ", status=" + status
				+ "]";
	}
	
	
}
