package com.ewertonilima.iccsofttest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewertonilima.iccsofttest.entities.Quote;
import com.ewertonilima.iccsofttest.repositories.QuoteRepository;

@Service
public class QuoteService {

	@Autowired
	QuoteRepository quoteRepository;

	public List<Quote> findAll() {
		List<Quote> result = quoteRepository.findAll();
		return result;
	}
	
	public Quote findById(Long id) {
		Optional<Quote> result = quoteRepository.findById(id);
		return result.orElse(null);
	}
	
	public Quote insert(Quote quote) {
		quote.setId(null);
		quote = quoteRepository.save(quote);
		return quote;
	}
}
