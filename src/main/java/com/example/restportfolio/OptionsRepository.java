package com.example.restportfolio;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Flux;

@RepositoryRestResource(collectionResourceRel = "options", path = "options")
public interface OptionsRepository extends ReactiveCrudRepository<Options, String> {
    Flux<Options> findAllBy(String ticker);
}

