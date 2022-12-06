package com.bsoftware.bffigf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("home")
@RestController
public class BffIgfApplication {

    public static void main(String[] args) {
        SpringApplication.run(BffIgfApplication.class, args);
    }

    @GetMapping
    public String home(){
        return "Home Bff";
    }

}
