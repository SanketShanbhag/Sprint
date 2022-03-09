package com.mortgageManagmentSystem.existingCustomerservices.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgageManagmentSystem.existingCustomerservices.repository.LoanAccountRepository;
import com.mortgageManagmentSystem.existingCustomerservices.service.LoanAccountService;
import com.mortgageManagmentSystem.existingCustomerservices.service.LoanAccountServiceImpl;



@SpringBootTest
public class LoanAccountNotFoundExceptionTest {
	
	@InjectMocks
	private LoanAccountService loanAccountService=new LoanAccountServiceImpl();
	
	@Mock
	private LoanAccountRepository loanAccountRepository;
	
	@Test
	public void testLoanAccountByIdNotFound() {
		int customerId=200;
		
		when(loanAccountRepository.findById(customerId)).thenThrow(LoanAccountNotFoundException.class);
		assertThrows(LoanAccountNotFoundException.class,()->loanAccountService.viewEMIDetails(customerId));
	}

}
