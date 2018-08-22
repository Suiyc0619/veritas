package com.prime.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.prime.model.Person;
import com.prime.model.PersonCon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@RestController
public class PrimeController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    Person person;
    @Autowired
    PersonCon personCon;

    @RequestMapping("/prime")
    public String prime(HttpServletRequest request) {
        logger.trace("通配符测试...a");
        request.getParameter("");
        Locale locale = new Locale("","");
        System.out.println(personCon.person());
//        return person;
        return "这是一个SpringBoot项目的完美开端！Git测试。增量包测试！";

    }

}
