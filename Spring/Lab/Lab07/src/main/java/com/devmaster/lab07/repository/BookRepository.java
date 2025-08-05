package com.devmaster.lab07.repository;

import com.devmaster.lab07.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
