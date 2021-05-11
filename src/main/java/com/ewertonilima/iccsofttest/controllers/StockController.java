package com.ewertonilima.iccsofttest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewertonilima.iccsofttest.entities.Stock;
import com.ewertonilima.iccsofttest.repositories.StockRepository;

@RestController
@RequestMapping(value = "/stocks")
public class StockController {
	
	@Autowired
	StockRepository stockRepository;
	
	@GetMapping
	public ResponseEntity<List<Stock>> getAll(){
		return ResponseEntity.ok(stockRepository.findAll());
	}

}
