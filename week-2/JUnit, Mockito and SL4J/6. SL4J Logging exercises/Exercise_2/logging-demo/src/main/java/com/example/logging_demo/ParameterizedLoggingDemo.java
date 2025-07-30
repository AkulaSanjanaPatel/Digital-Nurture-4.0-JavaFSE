package com.example.logging_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingDemo {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingDemo.class);

    public static void main(String[] args) {
        String username = "Alice";
        int userAge = 30;

        // Parameterized logging using placeholders {}
        logger.info("User logged in: name={}, age={}", username, userAge);

        // Example of multiple placeholders
        String product = "Laptop";
        double price = 59999.99;
        logger.info("User {} purchased a {} for Rs. {}", username, product, price);

        // Example of debug logging
        logger.debug("Debug log for user={} age={}", username, userAge);
    }
}
