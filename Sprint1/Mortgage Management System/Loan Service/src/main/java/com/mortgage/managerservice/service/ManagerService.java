package com.mortgage.managerservice.service;

import java.util.List;

import com.mortgage.managerservice.entity.LoanDetails;

public interface ManagerService {
	public List<LoanDetails> getAllDetails();
	public LoanDetails getDetailsByCustomerId(int customerId);
	public LoanDetails updateLoanDetails(LoanDetails loanDetails);
	public void deleteLoanDetails(int customerId);
	
}
	



