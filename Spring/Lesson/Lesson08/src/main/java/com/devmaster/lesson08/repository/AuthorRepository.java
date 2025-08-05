package com.devmaster.lesson08.repository;

import com.devmaster.lesson08.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
