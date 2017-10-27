package com.kds.boot.springbootadvanced.controllers;

import com.kds.boot.springbootadvanced.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kalpasenanayake on 27/10/17.
 */

@RestController
public class GreetController {

    private GreetingService greetingService;

    public GreetController(@Qualifier(value = "greetingServiceEnglish") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/greet/{name}")
    public String greet(@PathVariable(value = "name") String name, @RequestParam String ln) {

        return greetingService.greet() + " " + name;

    }
}
