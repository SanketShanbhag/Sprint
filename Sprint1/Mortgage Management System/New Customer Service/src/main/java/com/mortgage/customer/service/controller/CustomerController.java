package com.mortgage.customer.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mortgage.customer.service.entity.Address;
import com.mortgage.customer.service.entity.Customer;
import com.mortgage.customer.service.entity.IncomeAndProperty;
import com.mortgage.customer.service.entity.MortgageLoan;
import com.mortgage.customer.service.entity.PropertyDocument;
import com.mortgage.customer.service.entity.TypesOfMortgageLoans;
import com.mortgage.customer.service.service.CustomerService;

@RestController
@RequestMapping
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/enter CustomerDetails")
	public Customer customerDetails(@RequestBody Customer customer) {

		return customerService.saveCustomer(customer);
	}

	@PostMapping("/Enter LocationDetails")
	public Address addressDetails(@RequestBody Address address) {

		return customerService.saveCustomerAdress(address);
	}

	@PostMapping("/Enter MortgageLoan Details")
	public MortgageLoan mortgageLoan(@RequestBody MortgageLoan mortgageLoan) {

		return customerService.saveMortgageLoan(mortgageLoan);

	}

	@GetMapping("/View TypesOfMortgageLoans")
	public List<TypesOfMortgageLoans> fetchAll(TypesOfMortgageLoans typesOfMortgageLoans) {
		List<TypesOfMortgageLoans> TypesOfMortgageLoans = customerService.getAllTypesOfLoans();
		return TypesOfMortgageLoans;
	}

	@PostMapping("/Enter IncomeAndProperty details")
	public IncomeAndProperty income(@RequestBody IncomeAndProperty incomeAndProperty) {

		return customerService.saveIncomeAndProperty(incomeAndProperty);

	}

	@PostMapping("/Enter PropertyDocument")
	public PropertyDocument property(@RequestBody PropertyDocument propertyDocument) {
		return customerService.savePropertyDocument(propertyDocument);

	}

	
}
