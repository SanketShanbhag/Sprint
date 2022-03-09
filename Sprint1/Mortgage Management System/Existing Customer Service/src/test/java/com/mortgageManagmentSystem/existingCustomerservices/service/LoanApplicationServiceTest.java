package com.mortgageManagmentSystem.existingCustomerservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgageManagmentSystem.existingCustomerservices.entity.MortgageLoanApplication;
import com.mortgageManagmentSystem.existingCustomerservices.repository.LoanApplicationRepository;


@SpringBootTest
public class LoanApplicationServiceTest {
	
	@InjectMocks
	private LoanApplicationService loanApplicationService=new LoanApplicationServiceImpl();
	
	@Mock
	private LoanApplicationRepository loanApplicationRepository;
	
	@Test
	public void checkApprovalStatus() {
		
		MortgageLoanApplication mortgageLoanApplication=new MortgageLoanApplication();
		mortgageLoanApplication.setCustomer_id(101);
		mortgageLoanApplication.setTypeofMortgage("dummy mortgage");
		mortgageLoanApplication.setLoanAmount(5000000);
		mortgageLoanApplication.setTenure(5);
		mortgageLoanApplication.setApprovalStatus("Approved");
		
		Optional<MortgageLoanApplication> optionalLoanApplication=Optional.of(mortgageLoanApplication);
		int customerId=101;
		
		when(loanApplicationRepository.findById(customerId)).thenReturn(optionalLoanApplication);
		
		MortgageLoanApplication actualLoanApplication=loanApplicationService.viewApprovalStatus(customerId);
		
		assertEquals(customerId,actualLoanApplication.getCustomer_id());
		assertEquals("dummy mortgage",actualLoanApplication.getTypeofMortgage());
		assertEquals(5000000,actualLoanApplication.getLoanAmount());
		assertEquals(5,actualLoanApplication.getTenure());
		assertEquals("Approved",actualLoanApplication.getApprovalStatus());
		
	}

}
