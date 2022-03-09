package com.mortgageManagmentSystem.existingCustomerservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgageManagmentSystem.existingCustomerservices.entity.MortgageLoanApplication;


public interface LoanApplicationRepository extends JpaRepository<MortgageLoanApplication,Integer> {

}
