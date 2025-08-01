package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

    // Step 1: Create Logger
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("SpringLearn Application START");
        SpringApplication.run(SpringLearnApplication.class, args);

        SpringLearnApplication app = new SpringLearnApplication();
        app.displayDate();

        LOGGER.info("SpringLearn Application END");
    }

    // Example method with proper logging
    public void displayDate() {
        LOGGER.info("START displayDate");
        Date date = new Date();
        LOGGER.debug("Current Date: {}", date); // debug log
        LOGGER.info("END displayDate");
    }
}
