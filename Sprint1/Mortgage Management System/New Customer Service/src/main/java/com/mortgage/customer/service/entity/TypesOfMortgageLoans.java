package com.mortgage.customer.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typesofmortgageloans")
public class TypesOfMortgageLoans {
	@Id
	private String types_of_Mortgage_loans;

	public String getTypes_of_Mortgage_loans() {
		return types_of_Mortgage_loans;
	}

	public void setTypes_of_Mortgage_loans(String types_of_Mortgage_loans) {
		this.types_of_Mortgage_loans = types_of_Mortgage_loans;
	}
	
	

}
