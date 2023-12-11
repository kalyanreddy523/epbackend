package com.educationalportal.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AssignmentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long assignmentId;
	private String assignmentname;
	private String assignmentfile;
	public long getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(long assignmentId) {
		this.assignmentId = assignmentId;
	}
	public String getAssignmentname() {
		return assignmentname;
	}
	public void setAssignmentname(String assignmentname) {
		this.assignmentname = assignmentname;
	}
	public String getAssignmentfile() {
		return assignmentfile;
	}
	public void setAssignmentfile(String assignmentfile) {
		this.assignmentfile = assignmentfile;
	}
	public AssignmentEntity(long assignmentId, String assignmentname, String assignmentfile) {
		super();
		this.assignmentId = assignmentId;
		this.assignmentname = assignmentname;
		this.assignmentfile = assignmentfile;
	}
	public AssignmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AssignmentEntity [assignmentId=" + assignmentId + ", assignmentname=" + assignmentname
				+ ", assignmentfile=" + assignmentfile + "]";
	}
	

}
