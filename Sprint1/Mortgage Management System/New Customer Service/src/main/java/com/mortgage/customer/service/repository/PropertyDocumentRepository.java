package com.mortgage.customer.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortgage.customer.service.entity.PropertyDocument;

public interface PropertyDocumentRepository extends JpaRepository<PropertyDocument,Integer> {

}
