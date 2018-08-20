package com.prime.model;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "person")
public class Person {
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                '}';
    }
}
