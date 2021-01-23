package com.ashokit.ssa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.ssa.entity.CitizenSSN;
import com.ashokit.ssa.repo.CitizenSSNRepo;

@RestController
public class SSNVerificationController {
	
	@Autowired
	CitizenSSNRepo repo;
	
	@GetMapping("/verify/{ssn}")
	public ResponseEntity<CitizenSSN> verifyState(@PathVariable Integer ssn) {
		
		CitizenSSN citizen = repo.findBySsn(ssn);
		
		if(citizen != null) {
			return new ResponseEntity<CitizenSSN> (citizen, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<CitizenSSN> (HttpStatus.NOT_FOUND);
		}
		
	}
}
