package com.mortgage.customer.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mortgageLoan")
public class MortgageLoan {

	@Id
	@Column(name="customer_id")
	private int customerId;
	private String typeofMortgage;
	private int tenure;
	private long loanAmount;
	private String approvalStatus;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
	
	
	
}
