package com.ewertonilima.iccsofttest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ewertonilima.iccsofttest.entities.Stock;
import com.ewertonilima.iccsofttest.repositories.StockRepository;

@Service
public class StockService {
	
	@Autowired
	StockRepository stockRepository;
	
	public List<Stock> findAll() {
		List<Stock> stocks = stockRepository.findAll();
		return stocks.stream().collect(Collectors.toList());
	}
	
	public Stock findByName(String name) {
		Stock stock = stockRepository.findAllByNameContainingIgnoreCase(name);
		return stock;
	}
	
	@Transactional
	public Stock insert(Stock stock) {
		stock = stockRepository.save(stock);
		return stock;
	}

}
