package com.mortgageManagmentSystem.existingCustomerservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgageManagmentSystem.existingCustomerservices.entity.LoanAccount;
import com.mortgageManagmentSystem.existingCustomerservices.exception.LoanAccountNotFoundException;
import com.mortgageManagmentSystem.existingCustomerservices.repository.LoanAccountRepository;

@Service
public class LoanAccountServiceImpl implements LoanAccountService {

	@Autowired
	private LoanAccountRepository loanAccountRepository;

	/**
	 * - Method Name : viewEMIDetails
	 * - Input Parameters :  customerId
	 * - Return type : LoanAccount
	 * - Author : Sanket Shanbhag 
	 * -Creation Date : 07-03-2022 
	 * - Description : Existing Customer viewing the EMI details of his Mortgage Loan Account.
	 **/
	@Override
	public LoanAccount viewEMIDetails(int customerId) throws LoanAccountNotFoundException {
		Optional<LoanAccount> optionalloanAccount = loanAccountRepository.findById(customerId);

		if (optionalloanAccount.isEmpty()) {

			throw new LoanAccountNotFoundException("Sorry! Loan Account not found with customer ID: " + customerId);

		}

		return optionalloanAccount.get();
	}

}
