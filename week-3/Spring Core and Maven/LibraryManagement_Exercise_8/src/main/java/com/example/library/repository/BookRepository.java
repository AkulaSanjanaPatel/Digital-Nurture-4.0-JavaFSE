package com.example.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayBooks() {
        System.out.println("Book list from repository...");
    }
}