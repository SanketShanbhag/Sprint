package com.mortgageManagmentSystem.existingCustomerservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_account")
public class LoanAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="type_of_mortgage")
	private String typeOfMortgage;
	
	@Column(name="account_no")
	private int accountNo;
	
	@Column(name="total_loan_amount")
	private int totalLoanAmount;
	
	@Column(name="tenure")
	private int tenure;
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="end_date")
	private String endDate;
	
	@Column(name="outstanding_charges")
	private double outstandingCharges;
	
	@Column(name="loan_status")
	private String loanStatus;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getTypeOfMortgage() {
		return typeOfMortgage;
	}
	public void setTypeOfMortgage(String typeOfMortgage) {
		this.typeOfMortgage = typeOfMortgage;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(int totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public double getOutstandingCharges() {
		return outstandingCharges;
	}
	public void setOutstandingCharges(double outstandingCharges) {
		this.outstandingCharges = outstandingCharges;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	
	

}
