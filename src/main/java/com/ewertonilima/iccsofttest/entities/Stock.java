package com.ewertonilima.iccsofttest.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_stock")
public class Stock implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(unique = true)
	private String name;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "stock_name", referencedColumnName = "name")
	private List<Quote> quotes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Quote> getQuotes() {
		return quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
}