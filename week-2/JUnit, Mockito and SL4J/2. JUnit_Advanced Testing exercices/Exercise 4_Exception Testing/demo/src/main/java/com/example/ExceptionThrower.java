package com.example;

public class ExceptionThrower {

    // This method always throws an exception
    public void throwException() throws IllegalArgumentException {
        throw new IllegalArgumentException("Invalid input provided!");
    }
}
