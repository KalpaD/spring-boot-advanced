package com.kds.boot.springbootadvanced.services;

import org.springframework.stereotype.Service;

/**
 * Created by kalpasenanayake on 27/10/17.
 */
@Service
public class GreetingServiceEnglish implements GreetingService {

    @Override
    public String greet() {
        return "Hello!";
    }
}
