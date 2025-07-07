package com.example.librarymanagement_exercise_9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librarymanagement_exercise_9.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
