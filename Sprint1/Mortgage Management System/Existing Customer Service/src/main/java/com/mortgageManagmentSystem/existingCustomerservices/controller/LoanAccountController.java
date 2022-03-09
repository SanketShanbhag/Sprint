package com.mortgageManagmentSystem.existingCustomerservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgageManagmentSystem.existingCustomerservices.entity.LoanAccount;
import com.mortgageManagmentSystem.existingCustomerservices.service.LoanAccountService;



@RestController
@RequestMapping("/mortgage")
public class LoanAccountController {
	
	@Autowired
	private LoanAccountService loanAccountService;
	
	
	@GetMapping("/viewEMIdetails/getbyexistingcustomerId/{cid}")
	public ResponseEntity<?> fetchLoanAccountDetails(@PathVariable("cid") int cid) {
		LoanAccount loanAccount = loanAccountService.viewEMIDetails(cid);
		return new ResponseEntity<>(loanAccount, HttpStatus.OK);
	}
}
