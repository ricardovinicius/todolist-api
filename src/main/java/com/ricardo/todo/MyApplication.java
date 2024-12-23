package com.ricardo.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {
    @RequestMapping("/")
    String home() {
        return "Hello Worl";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
