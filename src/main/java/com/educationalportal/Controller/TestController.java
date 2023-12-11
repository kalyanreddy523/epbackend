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

import com.educationalportal.Entity.TestEntity;
import com.educationalportal.Repository.Testrepo;

@RestController
@CrossOrigin( origins = { "http://localhost:3000"})
public class TestController {
		
		@Autowired
		Testrepo testo;
		
		@PostMapping("/api/test")
		public ResponseEntity<TestEntity> saveTest(@RequestBody TestEntity test){
			return new ResponseEntity<>(testo.save(test),HttpStatus.CREATED);
		}
		@GetMapping("/api/test")
		public ResponseEntity<List<TestEntity>>getTests(){
			return new ResponseEntity<>(testo.findAll(),HttpStatus.OK);
		}
}
