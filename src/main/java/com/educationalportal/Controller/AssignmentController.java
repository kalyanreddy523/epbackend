package com.educationalportal.Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.educationalportal.Entity.AssignmentEntity;
import com.educationalportal.Repository.Assignmentrepo;

@RestController
@CrossOrigin( origins = { "http://localhost:3000"})
public class AssignmentController {
		
	@Autowired
	Assignmentrepo assignmentrepo;
	
	@PostMapping("/api/assignment")
	public ResponseEntity<AssignmentEntity>saveAssignment(@RequestBody AssignmentEntity assign){
		return new ResponseEntity<>(assignmentrepo.save(assign),HttpStatus.CREATED);
		
	}
	@PostMapping("/api/uploadfile")
	public String uploadFile( MultipartFile file) throws IOException {
		  FileInputStream inputStream = (FileInputStream) file.getInputStream();
		  return "uploladed successfully";
		}
	
	@GetMapping("/api/assignment")
	public ResponseEntity<List<AssignmentEntity>>getAssignments(){
		return new ResponseEntity<>(assignmentrepo.findAll(),HttpStatus.OK);
	}
	
}
