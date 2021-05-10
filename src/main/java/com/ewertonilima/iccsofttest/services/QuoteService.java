package com.ewertonilima.iccsofttest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ewertonilima.iccsofttest.entities.Quote;
import com.ewertonilima.iccsofttest.repositories.QuoteRepository;

@Service
public class QuoteService {
	
	@Autowired
	QuoteRepository quoteRepository;
	
	public List<Quote> findAll() {
		List<Quote> quotes = quoteRepository.findAll();
		return quotes.stream().collect(Collectors.toList());
	}

	@Transactional
	public Quote insert(Quote quote) {
		quote = quoteRepository.save(quote);
		return quote;
	}

}
