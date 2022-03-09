package com.mortgage.customer.service.test;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mortgage.customer.service.entity.Address;
import com.mortgage.customer.service.entity.Customer;
import com.mortgage.customer.service.entity.IncomeAndProperty;
import com.mortgage.customer.service.entity.MortgageLoan;
import com.mortgage.customer.service.entity.PropertyDocument;
import com.mortgage.customer.service.repository.AddressRepository;
import com.mortgage.customer.service.repository.CustomerRepository;
import com.mortgage.customer.service.repository.IncomeAndPropertyRepository;
import com.mortgage.customer.service.repository.MortgageLoanRepository;
import com.mortgage.customer.service.repository.PropertyDocumentRepository;
import com.mortgage.customer.service.service.CustomerService;
import com.mortgage.customer.service.service.CustomerServiceImpl;

@SpringBootTest
public class CustomerServiceTest {

	@InjectMocks
	private CustomerService customerService =new CustomerServiceImpl();
	
	@Mock
	private CustomerRepository customerRepository;
	
	@Mock
	private AddressRepository addressRepository;
	
	@Mock
	private MortgageLoanRepository mortgageRepository;
	
	@Mock
	private IncomeAndPropertyRepository incomeAndPropertyRepository;
	
	@Mock
	private PropertyDocumentRepository propertyDocumentRepository;
	
	
	
	@Test
	public void testSaveCustomer() {
		
		Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setFirstName("Devi");
        customer.setMiddleName("vara");
        customer.setLastName("prasad");
        customer.setGender("male");
        customer.setEmail("devi@gmail.com");
		customer.setAdharNo(5783929);
		customer.setPanNo("ghdhu88");
		customer.setPhoneNo(676456789);
		
		when(customerRepository.save(customer)).thenReturn(customer);
		

		 customerService.saveCustomer(customer);
		
	
		
		verify(customerRepository,times(1)).save(customer);
	}
     
	@Test
	 public void testSaveAddress() {
		 Address address = new Address();
		 address.setCustomerId(1);
		 address.setHouseNo("26-9-B");
		 address.setAreaName("YMR area");
		 address.setStreetName("YVU Streeet");
		 address.setPincode(516360);
		 address.setCity("kadapa");
		 address.setState("AP");
		 
		 when(addressRepository.save(address)).thenReturn(address);
		 customerService.saveCustomerAdress(address);
		 verify(addressRepository,times(1)).save(address);
	 }
	   
    	@Test
		public void testSaveMortgageLoan()
		{
			MortgageLoan mortgageLoan = new MortgageLoan();
			mortgageLoan.setCustomerId(1);
			mortgageLoan.setTypeofMortgage("personalLoan");
			mortgageLoan.setLoanAmount(300000);
			mortgageLoan.setTenure(12);
			mortgageLoan.setApprovalStatus("Waiting for approval");
			
			when(mortgageRepository.save(mortgageLoan)).thenReturn(mortgageLoan);
			customerService.saveMortgageLoan(mortgageLoan);
			verify(mortgageRepository,times(1)).save(mortgageLoan);
			
		}
		
    	@Test
		public void testSaveIncomeAndProperty() {
			IncomeAndProperty incomeAndProperty=new IncomeAndProperty();
			incomeAndProperty.setCustomerId(1);
			incomeAndProperty.setOrganizationType("Business");
			incomeAndProperty.setTypeOfEmployment("Full-Time");
			incomeAndProperty.setIncome(40000);
			incomeAndProperty.setRetirementAge(70);
			
			when(incomeAndPropertyRepository.save(incomeAndProperty)).thenReturn(incomeAndProperty);
		    customerService.saveIncomeAndProperty(incomeAndProperty);
		    verify(incomeAndPropertyRepository,times(1)).save(incomeAndProperty);
		}
		
    	@Test
		public void testSavePropertyDocument() {
			PropertyDocument PropertyDocument = new PropertyDocument();
			PropertyDocument.setCustomerId(1);
			PropertyDocument.setDocId(1090);
			PropertyDocument.setDocName("House Documents");
			PropertyDocument.setPropertyLoc("kadapa");
			PropertyDocument.setPropertyValue(500000);
			
			when(propertyDocumentRepository.save(PropertyDocument)).thenReturn(PropertyDocument);
		    customerService.savePropertyDocument(PropertyDocument);
		    verify(propertyDocumentRepository,times(1)).save(PropertyDocument);
			
		}
	}

