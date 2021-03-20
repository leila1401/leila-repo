package com.saraya.currencyexchange3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.currencyexchange3.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange , Long> {
	CurrencyExchange findByFromAndTo(String from , String to);
}
