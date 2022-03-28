package com.example.restportfolio.repository;

import com.example.restportfolio.model.Stocks;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "stocks", path = "stocks")
public interface StocksRepository extends R2dbcRepository<Stocks, String> {
}

