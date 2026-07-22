package com.cognizant.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.demo.model.Country;


@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("india", Country.class);

    }
    
    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries = new ArrayList<>();

        countries.add(context.getBean("india", Country.class));
        countries.add(context.getBean("usa", Country.class));
        countries.add(context.getBean("japan", Country.class));
        countries.add(context.getBean("germany", Country.class));

        return countries;
    }

}