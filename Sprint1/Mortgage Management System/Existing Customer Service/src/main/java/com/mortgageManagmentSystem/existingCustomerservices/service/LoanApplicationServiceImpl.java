package com.mortgageManagmentSystem.existingCustomerservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgageManagmentSystem.existingCustomerservices.entity.MortgageLoanApplication;
import com.mortgageManagmentSystem.existingCustomerservices.exception.LoanApplicationNotFoundException;
import com.mortgageManagmentSystem.existingCustomerservices.repository.LoanApplicationRepository;


@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {
	
	@Autowired
	private LoanApplicationRepository loanApplicationRepository;
	
	/**
	 * - Method Name : viewApprovalStatus
	 * - Input Parameters :  customerId
	 * - Return type : MortgageLoanApplication
	 * - Author : Sanket Shanbhag
	 * -Creation Date : 07-03-2022 
	 * - Description : New Customer viewing the Approval status of his Mortgage Loan Application.
	 **/

	@Override
	public MortgageLoanApplication viewApprovalStatus(int customerId) throws LoanApplicationNotFoundException {
		
		Optional<MortgageLoanApplication> optionalloanApplication=loanApplicationRepository.findById(customerId);
		
		if(optionalloanApplication.isEmpty()) {
			
			throw new LoanApplicationNotFoundException("Sorry! Loan Application not found with customer ID: " +customerId);
			
		}
		
		return optionalloanApplication.get();
		
	}

}
