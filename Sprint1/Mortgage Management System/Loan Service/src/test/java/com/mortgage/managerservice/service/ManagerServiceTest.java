package com.mortgage.managerservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgage.managerservice.entity.LoanDetails;
import com.mortgage.managerservice.repository.ManagerRepository;

@SpringBootTest
public class ManagerServiceTest {
	@InjectMocks
	private ManagerService  managerService = new ManagerServiceImpl();
	@Mock
	private ManagerRepository managerRepository;
	
	@Test
	public void testgetDetailsByCustomerId() {
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setCustomerId(1);
		loanDetails.setAccNo(1234567890);
		loanDetails.setType_Of_Mortgage("dummyname");
		loanDetails.setTotal_Loan_Ammount(300000000);
		loanDetails.setStartDate(LocalDate.of(2022, 03, 1));
		loanDetails.setEndDate(LocalDate.of(2027, 03, 1));
		loanDetails.setTenture(5);
		loanDetails.setOutstandingCharges(34567);
		loanDetails.setLoanStatus("Approved");
		
		Optional<LoanDetails> optionalLoanDetails = Optional.of(loanDetails);
		int customerId = 1;
		
		when(managerRepository.findById(1)).thenReturn(optionalLoanDetails);
		
		LoanDetails existingLoanDetails = managerService.getDetailsByCustomerId(customerId);
		
		assertEquals(loanDetails.getType_Of_Mortgage(),existingLoanDetails.getType_Of_Mortgage());
	
	}
}
