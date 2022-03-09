package com.mortgageManagmentSystem.existingCustomerservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgageManagmentSystem.existingCustomerservices.entity.MortgageLoanApplication;
import com.mortgageManagmentSystem.existingCustomerservices.service.LoanApplicationService;



@RestController
@RequestMapping("/mortgage")
public class LoanApplicationController {
	
	@Autowired
	private LoanApplicationService loanApplicationService;
	
	@GetMapping("/viewLoanApprovalStatus/getbynewcustomerappId/{cid}")
	public ResponseEntity<?> fetchLoanApplicationDetails(@PathVariable("cid") int cid) {
		MortgageLoanApplication loanApplication = loanApplicationService.viewApprovalStatus(cid);
		return new ResponseEntity<>(loanApplication, HttpStatus.OK);
	}

}
