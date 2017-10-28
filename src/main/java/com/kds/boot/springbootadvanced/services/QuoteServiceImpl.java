package com.kds.boot.springbootadvanced.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kalpasenanayake on 28/10/17.
 */
@Service
public class QuoteServiceImpl implements QuoteService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote() {
       return chuckNorrisQuotes.getRandomQuote();
    }
}
