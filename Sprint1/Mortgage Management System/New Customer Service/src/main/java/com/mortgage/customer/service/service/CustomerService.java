package com.mortgage.customer.service.service;

import java.util.List;

import com.mortgage.customer.service.entity.Address;
import com.mortgage.customer.service.entity.Customer;
import com.mortgage.customer.service.entity.IncomeAndProperty;
import com.mortgage.customer.service.entity.MortgageLoan;
import com.mortgage.customer.service.entity.PropertyDocument;
import com.mortgage.customer.service.entity.TypesOfMortgageLoans;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	
	public Address saveCustomerAdress(Address address);
	
	public MortgageLoan saveMortgageLoan(MortgageLoan mortgageLoan);
	
	public IncomeAndProperty saveIncomeAndProperty(IncomeAndProperty incomeAndProperty);
	
	public PropertyDocument savePropertyDocument(PropertyDocument propertyDocument);
	
	public List<TypesOfMortgageLoans> getAllTypesOfLoans();
	

}
