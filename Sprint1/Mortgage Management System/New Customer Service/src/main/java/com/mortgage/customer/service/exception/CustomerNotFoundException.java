package com.mortgage.customer.service.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String msg) {
    	super(msg);
    }
}
