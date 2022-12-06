package com.bsoftware.bffigfapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("home")
public class BffigfApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BffigfApiApplication.class, args);
    }

    @GetMapping
    public String home(){
        return "Home Page";
    }
}
