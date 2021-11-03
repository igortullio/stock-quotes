package com.igortullio.stock_quotes_api;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends ReactiveSortingRepository<Quote, Long> {
}
