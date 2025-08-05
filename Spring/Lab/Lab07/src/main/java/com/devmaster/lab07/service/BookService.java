package com.devmaster.lab07.service;

import com.devmaster.lab07.dto.BookDTO;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookDTO> findAll();
    Optional<BookDTO> findById(Long id);
    BookDTO save(BookDTO bookDTO);
    void deleteById(Long id);
}
