package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    @Test
    void testUppercase() {
        String input = "hello";
        assertTrue(input.toUpperCase().equals("HELLO"));
    }

    @Test
    void testContains() {
        String input = "JUnit5 Suite Example";
        assertTrue(input.contains("Suite"));
    }
}
