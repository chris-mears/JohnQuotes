package com.johnquotes.demo.controllers;

import com.johnquotes.demo.entities.Quote;
import com.johnquotes.demo.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    @Autowired
    QuoteRepository quoteRepository;

    @RequestMapping(value="/randomquote", method = RequestMethod.GET)
    public String randomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        Random rand = new Random();
        Quote quote = quotes.get(rand.nextInt(quotes.size()));
        return quote.getQuote();
    }
}
