package com.mortgage.managerservice.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loandetails")
public class LoanDetails {
	
	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "type_of_mortgage")
	private String type_Of_Mortgage;
	
	@Column(name = "acc_no")
	private int accNo;
	
	@Column(name = "total_loan_ammount")
	private long total_Loan_Ammount;
	
	@Column(name = "tenture")
	private int Tenture;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "end_date")
	private LocalDate endDate;
	
	@Column(name = "outstanding_charges")
	private double outstandingCharges;
	
	@Column(name = "loan_status")
	private String loanStatus;
	
	
	
	public LoanDetails() {
		super();
	
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getType_Of_Mortgage() {
		return type_Of_Mortgage;
	}



	public void setType_Of_Mortgage(String type_Of_Mortgage) {
		this.type_Of_Mortgage = type_Of_Mortgage;
	}



	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public long getTotal_Loan_Ammount() {
		return total_Loan_Ammount;
	}



	public void setTotal_Loan_Ammount(long total_Loan_Ammount) {
		this.total_Loan_Ammount = total_Loan_Ammount;
	}



	public int getTenture() {
		return Tenture;
	}



	public void setTenture(int tenture) {
		Tenture = tenture;
	}



	public LocalDate getStartDate() {
		return startDate;
	}



	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}



	public LocalDate getEndDate() {
		return endDate;
	}



	public void setEndDate(LocalDate endDate) {
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

