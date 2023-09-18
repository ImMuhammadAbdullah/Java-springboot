package com.in28Minutes.spring.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyServiceController {
//    @GetMapping("/course")
    @Autowired
    private CurrencyServiceConfiguration currencyConfiguration;
    @GetMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses( ) {
        return currencyConfiguration;
    }
}
