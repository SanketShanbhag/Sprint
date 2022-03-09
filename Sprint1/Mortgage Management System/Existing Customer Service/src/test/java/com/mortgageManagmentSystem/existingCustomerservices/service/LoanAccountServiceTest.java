package com.mortgageManagmentSystem.existingCustomerservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgageManagmentSystem.existingCustomerservices.entity.LoanAccount;
import com.mortgageManagmentSystem.existingCustomerservices.repository.LoanAccountRepository;



@SpringBootTest
public class LoanAccountServiceTest {
	
	@InjectMocks
	private LoanAccountService loanAccountService=new LoanAccountServiceImpl();
	
	@Mock
	private LoanAccountRepository loanAccountRepository;
	
	@Test
	public void testCheckEmiDetails() {
		
		LoanAccount loanAccount=new LoanAccount();
		loanAccount.setCustomerId(20);
		loanAccount.setTypeOfMortgage("dummy mortgage");
		loanAccount.setAccountNo(4567);
		loanAccount.setTotalLoanAmount(80000000);
		loanAccount.setTenure(7);
		loanAccount.setStartDate("12-06-2017");
		loanAccount.setEndDate("12-06-2027");
		loanAccount.setOutstandingCharges(50000000);
		loanAccount.setLoanStatus("Active");
		
		Optional<LoanAccount> optionalLoanAccount=Optional.of(loanAccount);
		int customerId=20;
		
		
		when(loanAccountRepository.findById(customerId)).thenReturn(optionalLoanAccount);
		
		LoanAccount actualLoanAccount=  loanAccountService.viewEMIDetails(customerId);
		
		assertEquals(customerId,actualLoanAccount.getCustomerId());
		assertEquals("dummy mortgage", actualLoanAccount.getTypeOfMortgage());
		assertEquals(4567, actualLoanAccount.getAccountNo());
		assertEquals(80000000, actualLoanAccount.getTotalLoanAmount());
		assertEquals(7, actualLoanAccount.getTenure());
		assertEquals("12-06-2017", actualLoanAccount.getStartDate());
		assertEquals("12-06-2027", actualLoanAccount.getEndDate());
		assertEquals(50000000, actualLoanAccount.getOutstandingCharges());
		assertEquals("Active", actualLoanAccount.getLoanStatus());
		
		
		
	}

}
