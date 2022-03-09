package com.mortgage.managerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.managerservice.entity.LoanDetails;
import com.mortgage.managerservice.service.ManagerService;
import com.mortgage.managerservice.service.ManagerServiceImpl;




@RestController
@RequestMapping("/managerservice")
public class ManagerController {
	
	
		@Autowired
        private ManagerService managerService;
		
		
		
		/**Inserting the CustomerAddress information entered by customer into the database.**/
		@GetMapping("/all")
		public List<LoanDetails> getAllDetails() {
			return managerService.getAllDetails();
		}
		
		/**To Search Loan Details Using CustomerId **/
		@GetMapping("/view/{cid}")
		public ResponseEntity<?> fetchLoanDetails(@PathVariable("cid") int customerId) {
			LoanDetails loanDetails = managerService.getDetailsByCustomerId(customerId);
			return new ResponseEntity<>(loanDetails, HttpStatus.OK);
		}
		
		/**To Update Loan Details Using customerId**/
		@PutMapping("/update")
		public ResponseEntity<LoanDetails> modifyLoanDetails(@RequestBody LoanDetails loanDetails) {
			LoanDetails updatedLoanDetails = managerService.updateLoanDetails(loanDetails);
			return new ResponseEntity<>(updatedLoanDetails, HttpStatus.OK);
		}
		
		
		/**To Delete Loan Details Using customerId For manager**/
		@DeleteMapping("/delete/{cid}")
		public ResponseEntity<?> deleteLoanDetails(@PathVariable("cid") int customerId) {
			managerService.deleteLoanDetails(customerId);
			return new ResponseEntity<>("Loan Details Deleted with id: "+customerId, HttpStatus.OK);
		}
	    
		
	
}
