package com.devmaster.lesson08.repository;

import com.devmaster.lesson08.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
