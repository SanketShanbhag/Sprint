package com.mortgage.customer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.customer.service.entity.TypesOfMortgageLoans;

@Repository
public interface TypesOfMortgageLoansRepository extends JpaRepository<TypesOfMortgageLoans,String>{

}
