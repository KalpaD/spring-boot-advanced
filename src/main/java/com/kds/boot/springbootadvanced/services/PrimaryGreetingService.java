package com.kds.boot.springbootadvanced.services;

import com.kds.boot.springbootadvanced.repositories.GreetingRepository;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
