package com.ewertonilima.iccsofttest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewertonilima.iccsofttest.entities.Quote;
import com.ewertonilima.iccsofttest.services.QuoteService;

@RestController
@RequestMapping(value = "/quotes")
public class QuoteController {
	
	@Autowired
	QuoteService quoteService;
	
	@GetMapping
	public ResponseEntity<List<Quote>> findAll(){
		List<Quote> list = quoteService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Quote> findById(@PathVariable Long id){
		Quote quote = quoteService.findById(id);
		return ResponseEntity.ok(quote);
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Quote quote){
		quote = quoteService.insert(quote);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}
