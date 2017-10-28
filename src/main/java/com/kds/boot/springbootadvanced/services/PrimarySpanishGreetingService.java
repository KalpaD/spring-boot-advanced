package com.kds.boot.springbootadvanced.services;

import com.kds.boot.springbootadvanced.repositories.GreetingRepository;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
