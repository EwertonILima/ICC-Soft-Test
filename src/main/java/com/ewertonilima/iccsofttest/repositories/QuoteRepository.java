package com.ewertonilima.iccsofttest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonilima.iccsofttest.entities.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long>{

}
