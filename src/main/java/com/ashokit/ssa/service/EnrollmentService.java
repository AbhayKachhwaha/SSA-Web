package com.ashokit.ssa.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.ssa.bindings.Applicant;
import com.ashokit.ssa.entity.CitizenSSN;
import com.ashokit.ssa.repo.CitizenSSNRepo;

@Service
public class EnrollmentService {
	
	@Autowired
	CitizenSSNRepo repo;
	
	public String enrollForSSN(Applicant applicant) {
		
		
		
		CitizenSSN citizen = new CitizenSSN();
		Integer ssn = generateSSN();
		
		
		citizen.setFirstName(applicant.getFirstName());
		citizen.setLastName(applicant.getLastName());
		citizen.setGender(applicant.getGender());
		citizen.setState(applicant.getState());
		citizen.setSsn(ssn);
		citizen.setDob(applicant.getDob());
		
		repo.save(citizen);
		
		while(citizen.getSsn() == null) {
			citizen.setSsn(generateSSN());
			repo.save(citizen);
		}
		
		return "You have been successfully registered. Your SSN is "+citizen.getSsn();
	}
	
	public Integer generateSSN() {
		
		Random random = new Random();
		
		return (100000000 + random.nextInt(100000000));
	}
	
}
