package com.mortgage.customer.service.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.mortgage.customer.service.repository.MortgageLoanRepository;
import com.mortgage.customer.service.repository.PropertyDocumentRepository;
import com.mortgage.customer.service.repository.TypesOfMortgageLoansRepository;

import org.springframework.stereotype.Service;

import com.mortgage.customer.service.entity.Address;
import com.mortgage.customer.service.entity.Customer;
import com.mortgage.customer.service.entity.IncomeAndProperty;
import com.mortgage.customer.service.entity.MortgageLoan;
import com.mortgage.customer.service.entity.PropertyDocument;
import com.mortgage.customer.service.entity.TypesOfMortgageLoans;
import com.mortgage.customer.service.repository.AddressRepository;
import com.mortgage.customer.service.repository.CustomerRepository;
import com.mortgage.customer.service.repository.IncomeAndPropertyRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private MortgageLoanRepository mortgageLoanRepository;
	
	@Autowired
	private IncomeAndPropertyRepository incomeAndPropertyRepository;
	
	@Autowired
	private PropertyDocumentRepository propertyDocumentRepository;
	
	@Autowired
	private TypesOfMortgageLoansRepository typesOfMortgageLoansRepository;
	
	
	/****************************************************************************************************************************
	 - Method Name      : saveCustomer
	 - Input Parameters : Customer customer
	 - Return type      : Customer
	 - Author           : Devi Varaprasad Ganjikunta
	 - Creation Date    : 06-03-2022
	 - Description      : Inserting the customer information entered by customer   into  the database.
	  ****************************************************************************************************************************/ 

	
	@Override
	public Customer saveCustomer(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer;
	}
	

	/****************************************************************************************************************************
	 - Method Name      : saveCustomerAdress
	 - Input Parameters : Address address
	 - Return type      : Address
	 - Author           : Devi Varaprasad Ganjikunta
	 - Creation Date    : 06-03-2022
	 - Description      : Inserting the CustomerAddress information entered by customer   into  the database.
	  ****************************************************************************************************************************/ 


	@Override
	public Address saveCustomerAdress(Address address) {
		Address savedCustomer = addressRepository.save(address);
		return savedCustomer;
	}


	/****************************************************************************************************************************
	 - Method Name      : saveMortgageLoan
	 - Input Parameters : MortgageLoan mortgageLoan
	 - Return type      : MortgageLoan
	 - Author           : Devi Varaprasad Ganjikunta
	 - Creation Date    : 06-03-2022
	 - Description      : Inserting the MortgageLoan information entered by customer   into  the database.
	  ****************************************************************************************************************************/ 

	
	@Override
	public MortgageLoan saveMortgageLoan(MortgageLoan mortgageLoan) {
		MortgageLoan saveMortgageLoan = mortgageLoanRepository.save(mortgageLoan);
		return saveMortgageLoan;
	}
	

	/****************************************************************************************************************************
	 - Method Name      : saveIncomeAndProperty
	 - Input Parameters : IncomeAndProperty incomeAndProperty
	 - Return type      : IncomeAndProperty
	 - Author           : Devi Varaprasad Ganjikunta
	 - Creation Date    : 06-03-2022
	 - Description      : Inserting the IncomeAndProperty information entered by customer   into  the database.
	  ****************************************************************************************************************************/ 

	@Override
	public IncomeAndProperty saveIncomeAndProperty(IncomeAndProperty incomeAndProperty) {
		IncomeAndProperty saveIncomeAndProperty = incomeAndPropertyRepository.save(incomeAndProperty);
		return saveIncomeAndProperty;
	}

	

	/****************************************************************************************************************************
	 - Method Name      : savePropertyDocument
	 - Input Parameters : PropertyDocument propertyDocument
	 - Return type      : PropertyDocument
	 - Author           : Devi Varaprasad Ganjikunta
	 - Creation Date    : 06-03-2022
	 - Description      : Inserting the PropertyDocument information entered by customer   into  the database.
	  ****************************************************************************************************************************/ 
	
	@Override
	public PropertyDocument savePropertyDocument(PropertyDocument propertyDocument) {
		PropertyDocument savePropertyDocument = propertyDocumentRepository.save(propertyDocument);
		return savePropertyDocument;
	}


	/****************************************************************************************************************************
	 - Method Name      : getAllTypesOfLoans
	 - Return type      : TypesOfMortgageLoans
	 - Author           : Devi Varaprasad Ganjikunta
	 - Creation Date    : 06-03-2022
	 - Description      : Displays the TypesOfMortgageLoans information 
	  ****************************************************************************************************************************/ 
	
	
	@Override
	public List<TypesOfMortgageLoans> getAllTypesOfLoans() {
		List<TypesOfMortgageLoans> typesOfMortgageLoans=typesOfMortgageLoansRepository.findAll();
		return typesOfMortgageLoans;
	}


	
	

	

}
