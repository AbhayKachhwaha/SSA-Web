package com.ashokit.ssa.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CitizenSSN {
	
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private Date dob;
	@Id
	private Integer ssn;
	@Column(nullable = false)
	private String state;
}
