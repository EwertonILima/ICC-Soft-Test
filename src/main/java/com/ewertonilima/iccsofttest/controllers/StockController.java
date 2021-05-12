package com.ewertonilima.iccsofttest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewertonilima.iccsofttest.entities.Stock;
import com.ewertonilima.iccsofttest.services.StockService;

@RestController
@RequestMapping(value = "/stocks")
public class StockController {

	@Autowired
	StockService stockService;

	@GetMapping
	public ResponseEntity<List<Stock>> findAll() {
		List<Stock> list = stockService.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{name}")
	public ResponseEntity<Stock> findByName(@PathVariable String name) {
		Stock stock = stockService.findByName(name);
		return ResponseEntity.ok(stock);
	}

}
