package com.mortgage.customer.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property_document")
public class PropertyDocument {
	
	@Id
	@Column(name="customer_id")
	private int customerId;
	private int docId;
	private String docName;
	private String propertyLoc;
	private long propertyValue;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getPropertyLoc() {
		return propertyLoc;
	}
	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}
	public long getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(long propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	

}
