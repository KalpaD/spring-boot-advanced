package com.kds.boot.springbootadvanced.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
@Configuration
public class QuoteConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes () {
        return new ChuckNorrisQuotes();
    }
}
