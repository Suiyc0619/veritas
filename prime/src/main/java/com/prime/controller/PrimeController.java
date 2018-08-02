package com.prime.controller;

import com.prime.model.Person;
import com.prime.model.PersonCon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {
    @Autowired
    Person person;
    @Autowired
    PersonCon personCon;

    @RequestMapping("/prime")
    public Person prime(){
        System.out.println(personCon.person());
        return person;
    }
}
