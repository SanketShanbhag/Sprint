package com.mortgage.customer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.customer.service.entity.IncomeAndProperty;

@Repository
public interface IncomeAndPropertyRepository extends JpaRepository<IncomeAndProperty,Integer>{

}
