package com.DevTraining.Mission6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
@Component
//@PropertySource("classpath:application-test.properties")
public class HelloWorld {

    @Value("${spring.profiles.active.print}")
    private String printHello;

    @GetMapping
    public String hello(){
        return "Hello World : "+printHello;
    }
}