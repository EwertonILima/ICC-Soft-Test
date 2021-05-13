package com.ewertonilima.iccsofttest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewertonilima.iccsofttest.entities.Stock;
import com.ewertonilima.iccsofttest.repositories.StockRepository;

@Service
public class StockService {
	
	@Autowired
	StockRepository stockRepository;
	
	public List<Stock> findAll(){
		List<Stock> result = stockRepository.findAll();
		return result;
	}
	
	public Stock findById(String id) {
		Stock result = stockRepository.findByIdContainingIgnoreCase(id);
		return result;
	}

}
