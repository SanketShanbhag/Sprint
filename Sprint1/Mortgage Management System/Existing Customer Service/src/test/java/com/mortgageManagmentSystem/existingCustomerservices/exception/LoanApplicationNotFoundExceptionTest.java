package com.mortgageManagmentSystem.existingCustomerservices.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgageManagmentSystem.existingCustomerservices.repository.LoanApplicationRepository;
import com.mortgageManagmentSystem.existingCustomerservices.service.LoanApplicationService;
import com.mortgageManagmentSystem.existingCustomerservices.service.LoanApplicationServiceImpl;



@SpringBootTest
public class LoanApplicationNotFoundExceptionTest {
	
	@InjectMocks
	private LoanApplicationService loanApplicationService=new LoanApplicationServiceImpl();
	
	@Mock
	private LoanApplicationRepository loanApplicationRepository;
	
	@Test
	public void testLoanApplicationtByIdNotFound() {
		int customerId=200;
		
		when(loanApplicationRepository.findById(customerId)).thenThrow(LoanApplicationNotFoundException.class);
		assertThrows(LoanApplicationNotFoundException.class,()->loanApplicationService.viewApprovalStatus(customerId));
	}

}
