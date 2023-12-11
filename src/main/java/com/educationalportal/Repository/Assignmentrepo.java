package com.educationalportal.Repository;

import java.io.FileInputStream;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationalportal.Entity.AssignmentEntity;

public interface Assignmentrepo extends JpaRepository<AssignmentEntity,Long> {

	Object save(FileInputStream inputStream);
	

}
