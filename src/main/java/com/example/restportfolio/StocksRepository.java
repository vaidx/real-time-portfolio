package com.example.restportfolio;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stocks", path = "stocks")
public interface StocksRepository extends ReactiveCrudRepository<Stocks, String> {
}

