package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String home() {
        LOGGER.info("START home endpoint");
        String message = "Welcome to SpringLearn Application!";
        LOGGER.debug("Returning message: {}", message);
        LOGGER.info("END home endpoint");
        return message;
    }

    @GetMapping("/hello")
    public String hello() {
        LOGGER.info("START hello endpoint");
        String message = "Hello from Spring Boot!";
        LOGGER.debug("Returning message: {}", message);
        LOGGER.info("END hello endpoint");
        return message;
    }
}
