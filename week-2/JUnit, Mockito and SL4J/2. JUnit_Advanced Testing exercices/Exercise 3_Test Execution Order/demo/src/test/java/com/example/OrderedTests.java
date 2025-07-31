package com.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // 1️⃣ Specify ordering strategy
public class OrderedTests {

    @Test
    @Order(1) // 2️⃣ This test will run first
    void testLogin() {
        System.out.println("1. User logged in successfully");
    }

    @Test
    @Order(2) // 3️⃣ This test will run second
    void testAddToCart() {
        System.out.println("2. Item added to cart");
    }

    @Test
    @Order(3) // 4️⃣ This test will run last
    void testCheckout() {
        System.out.println("3. Checkout completed");
    }
}
