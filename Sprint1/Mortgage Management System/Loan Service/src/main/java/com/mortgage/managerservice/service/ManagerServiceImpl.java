package com.mortgage.managerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mortgage.managerservice.entity.LoanDetails;
import com.mortgage.managerservice.exception.ResourceNotFoundException;
import com.mortgage.managerservice.repository.ManagerRepository;


@Service
public class ManagerServiceImpl implements ManagerService {
	

	@Autowired
	private ManagerRepository managerRepository;
	
	/******************************************
	 - Method Name      : getAllDetails
	 - Input Parameters : CustomerId
	 - Return type      : int
	 - Author           : Nikita Ratnakar Kangude
	 - Creation Date    : 06-03-2022
	 - Description      : To Search All Loan Details in the database.
	  ******************************************/

	@Override
	public List<LoanDetails> getAllDetails() {
		List<LoanDetails> loanDetails = managerRepository.findAll();

		return loanDetails;
	}
	
	/******************************************
	 - Method Name      : getDetailsByCustomerId
	 - Input Parameters : customerId
	 - Return type      : int
	 - Author           : Nikita Ratnakar Kangude
	 - Creation Date    : 06-03-2022
	 - Description      : To Search loan Details Using CustomerId.
	  ******************************************/

	@Override
	public LoanDetails getDetailsByCustomerId(int customerId) throws ResourceNotFoundException {
		Optional<LoanDetails> optionalLoanDetails = managerRepository.findById(customerId);

		if (optionalLoanDetails.isEmpty()) {

			throw new ResourceNotFoundException("Sorry! Customer not found with id" + customerId);

		}
		return optionalLoanDetails.get();
	}
	
	/******************************************
	 - Method Name      : updateLoanDetails
	 - Input Parameters : LoanDetails loanDetails
	 - Return type      : String
	 - Author           :Nikita Ratnakar Kangude
	 - Creation Date    : 06-03-2022
	 - Description      : Update the loan details in database.
	  ******************************************/

	@Override
	public LoanDetails updateLoanDetails( LoanDetails loanDetails) {
		 Optional<LoanDetails> optionalLoanDetails = managerRepository.findById(loanDetails.getCustomerId());
			
			if(optionalLoanDetails.isEmpty()) {
				
				throw new ResourceNotFoundException("Sorry! Customer not found with id" +loanDetails.getCustomerId());
				
			}
			
			LoanDetails updatedLoanDetails = managerRepository.save(loanDetails);
			return updatedLoanDetails;
		}

	
	/******************************************
	 - Method Name      : deleteLoanDetails
	 - Input Parameters : customerId
	 - Return type      : int
	 - Author           : Nikita Ratnakar Kangude
	 - Creation Date    : 06-03-2022
	 - Description      : Delete the loan details of customer using customer Id from database.
	  ******************************************/

	@Override
	public void deleteLoanDetails(int customerId) throws ResourceNotFoundException {	
     Optional<LoanDetails> optionalLoanDetails = managerRepository.findById(customerId);
		
		if(optionalLoanDetails.isPresent()) {
			
			managerRepository.deleteById(customerId);
			
		}
		
		else {
			throw new ResourceNotFoundException("sorry Customer is not existing with id:" +customerId);
		}
		
	}

	

	

}