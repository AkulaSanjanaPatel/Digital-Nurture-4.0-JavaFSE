package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentAppendersDemo {

    private static final Logger logger = LoggerFactory.getLogger(DifferentAppendersDemo.class);

    public static void main(String[] args) {
        logger.debug("Debug message - useful for developers");
        logger.info("Info message - general information");
        logger.warn("Warning message - something unexpected but not an error");
        logger.error("Error message - something went wrong");

        System.out.println("Exercise 3: Logs written to console and app.log file!");
    }
}
