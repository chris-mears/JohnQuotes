package com.johnquotes.demo.repositories;


import com.johnquotes.demo.entities.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "quotes", path = "quotes")
@CrossOrigin("*")
public interface QuoteRepository extends MongoRepository<Quote, String> {

    List<Quote> findByQuote(@Param("quote") String quote);


}
