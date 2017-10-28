package com.kds.boot.springbootadvanced.services;

import com.kds.boot.springbootadvanced.repositories.GreetingRepository;
import org.springframework.stereotype.Component;

/**
 * Created by kalpasenanayake on 29/10/17.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }
}
