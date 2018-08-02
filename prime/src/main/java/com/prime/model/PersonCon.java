package com.prime.model;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableConfigurationProperties(Person.class)
public class PersonCon {
    private final Person person;

    public PersonCon(Person person) {
        this.person = person;
    }

    public Person person(){

        return person;
    }
}
