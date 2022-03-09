package com.mortgageManagmentSystem.existingCustomerservices.service;

import com.mortgageManagmentSystem.existingCustomerservices.entity.LoanAccount;
import com.mortgageManagmentSystem.existingCustomerservices.exception.LoanAccountNotFoundException;

public interface LoanAccountService {
	
	public LoanAccount viewEMIDetails(int customerId) throws LoanAccountNotFoundException;

}
