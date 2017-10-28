package com.kds.boot.springbootadvanced.controllers;

import com.kds.boot.springbootadvanced.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kalpasenanayake on 27/10/17.
 */

@RestController
public class GreetController {

    private GreetingService greetingService;

    public GreetController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/greet/{name}")
    public String greet(@PathVariable(value = "name") String name) {

        return greetingService.sayGreeting() + " " + name;

    }
}
