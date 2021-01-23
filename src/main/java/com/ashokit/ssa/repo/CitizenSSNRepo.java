package com.ashokit.ssa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ssa.entity.CitizenSSN;

public interface CitizenSSNRepo extends JpaRepository<CitizenSSN, Serializable> {

	public CitizenSSN findBySsn(Integer ssn);

}
