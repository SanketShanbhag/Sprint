package com.mortgageManagmentSystem.existingCustomerservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgageManagmentSystem.existingCustomerservices.entity.LoanAccount;

public interface LoanAccountRepository extends JpaRepository<LoanAccount,Integer>{
	
	

}
