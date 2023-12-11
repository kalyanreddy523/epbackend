package com.educationalportal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String customerid;
	private String coursename;
	private String score;
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
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public TestEntity(long id, String customerid, String coursename, String score) {
		super();
		Id = id;
		this.customerid = customerid;
		this.coursename = coursename;
		this.score = score;
	}
	public TestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TestEntity [Id=" + Id + ", customerid=" + customerid + ", coursename=" + coursename + ", score=" + score
				+ "]";
	}
	
	
}
