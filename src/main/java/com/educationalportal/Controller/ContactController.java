package com.educationalportal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalportal.Entity.ContactEntity;
import com.educationalportal.Repository.Contactrepo;

@RestController
@CrossOrigin( origins = { "http://localhost:3000"})
public class ContactController {
	
	@Autowired
	Contactrepo contactrep;
	
	@PostMapping("/api/contact")
	public ResponseEntity<ContactEntity>saveContact(@RequestBody ContactEntity contact){
		return new ResponseEntity<>(contactrep.save(contact),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/contact")
	public ResponseEntity<List<ContactEntity>>getContacts(){
		return new ResponseEntity<>(contactrep.findAll(),HttpStatus.OK);
	}
	
}
