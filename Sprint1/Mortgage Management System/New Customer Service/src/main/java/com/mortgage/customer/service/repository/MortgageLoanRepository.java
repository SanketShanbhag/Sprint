package com.mortgage.customer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.customer.service.entity.MortgageLoan;

@Repository
public interface MortgageLoanRepository extends JpaRepository<MortgageLoan,Integer> {

}
