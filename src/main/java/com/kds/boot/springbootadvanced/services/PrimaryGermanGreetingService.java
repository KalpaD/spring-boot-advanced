package com.kds.boot.springbootadvanced.services;

import com.kds.boot.springbootadvanced.repositories.GreetingRepository;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
