package com.kds.boot.springbootadvanced.controllers;

import com.kds.boot.springbootadvanced.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kalpasenanayake on 28/10/17.
 */
@Controller
public class QuoteController {

    private QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/quote")
    public String getQuote(Model model) {
        model.addAttribute("quote", quoteService.getRandomQuote());
        return "quote";
    }
}
