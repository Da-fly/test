package com.example.fast_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FastSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastSpringbootApplication.class, args);
    }
    @RequestMapping
    public String index(){
        return "Hello World!";
    }

}
