package com.educationalportal.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educationalportal.Entity.RegistrationEntity;
import com.educationalportal.Repository.Registrationrepo;

@RestController
@CrossOrigin( origins = { "http://localhost:3000"})
public class RegistrationController {
	
	@Autowired
	Registrationrepo registrationrepo;

	@PostMapping("/api/registration")
	public ResponseEntity<RegistrationEntity>saveCustomer(@RequestBody RegistrationEntity customer){
		return new ResponseEntity<>(registrationrepo.save(customer),HttpStatus.CREATED);
	}
	@GetMapping("/api/registration")
	public ResponseEntity<List<RegistrationEntity>>getCustomers(){
		return new ResponseEntity<>(registrationrepo.findAll(),HttpStatus.OK);
	}
	@GetMapping("/api/registration/{id}")
	public ResponseEntity<RegistrationEntity>getCustomer(@PathVariable long id){
		Optional<RegistrationEntity> customer=registrationrepo.findById(id);
		if(customer.isPresent()) {
			return new ResponseEntity<>(customer.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/api/registration/{id}")
	public ResponseEntity<RegistrationEntity>updateCustomer(@PathVariable long id, @RequestBody RegistrationEntity customer ){
		Optional<RegistrationEntity> custo=registrationrepo.findById(id);
		if(custo.isPresent()) {
			custo.get().setPassword(customer.getPassword());
			return new ResponseEntity<>(registrationrepo.save(custo.get()),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
