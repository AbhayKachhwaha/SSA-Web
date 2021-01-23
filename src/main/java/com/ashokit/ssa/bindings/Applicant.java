package com.ashokit.ssa.bindings;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String state;
	private Date dob;
}
