package com.ashokit.ssa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.ssa.bindings.Applicant;
import com.ashokit.ssa.service.EnrollmentService;

@RestController
public class SSNEnrollmentController {
	
	@Autowired
	private EnrollmentService service;
	
	@PostMapping("/enroll")
	public String enroll(@RequestBody Applicant applicant) {
		
		return service.enrollForSSN(applicant);
	}
}
