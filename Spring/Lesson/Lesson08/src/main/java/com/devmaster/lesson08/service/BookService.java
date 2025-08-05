package com.devmaster.lesson08.service;

import com.devmaster.lesson08.dto.BookDTO;
import com.devmaster.lesson08.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookDTO> findAll();
    Optional<BookDTO> findById(Long id);
    BookDTO save(BookDTO bookDTO);
    void deleteById(Long id);
}
