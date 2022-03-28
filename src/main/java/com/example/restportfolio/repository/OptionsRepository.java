package com.example.restportfolio.repository;

import com.example.restportfolio.model.Options;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "options", path = "options")
public interface OptionsRepository extends R2dbcRepository<Options, String> {
}

