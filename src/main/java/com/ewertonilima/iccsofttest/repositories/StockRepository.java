package com.ewertonilima.iccsofttest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ewertonilima.iccsofttest.entities.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
	
	@Transactional(readOnly=true)
	Stock findByIdContainingIgnoreCase(String id);

}
