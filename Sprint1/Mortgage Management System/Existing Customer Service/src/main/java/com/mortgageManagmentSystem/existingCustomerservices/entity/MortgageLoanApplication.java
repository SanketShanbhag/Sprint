package com.mortgageManagmentSystem.existingCustomerservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mortgageloan_application")
public class MortgageLoanApplication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="type_of_mortgage")
	private String typeofMortgage;
	
	@Column(name="tenure")
	private int tenure;
	
	@Column(name="loan_amount")
	private int loanAmount;
	
	@Column(name="approval_status")
	private String approvalStatus;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getTypeofMortgage() {
		return typeofMortgage;
	}
	public void setTypeofMortgage(String typeofMortgage) {
		this.typeofMortgage = typeofMortgage;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
}
