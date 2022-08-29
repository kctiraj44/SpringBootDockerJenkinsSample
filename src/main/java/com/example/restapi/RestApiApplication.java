package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }

    @GetMapping("/get")
    public String  getMessage(){
        return "*-------Welcome to Java ----*";
    }

    @GetMapping("/get1")
    public String  getMessage1(){
        return "*-------Welcome to Java 1 ----*";
    }


    @GetMapping("/get1")
    public String  getMessage2(){
        return "*-------Welcome to feature/dev7----*";
    }

}
