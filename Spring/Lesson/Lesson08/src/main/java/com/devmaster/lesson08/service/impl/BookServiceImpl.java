package com.devmaster.lesson08.service.impl;

import com.devmaster.lesson08.dto.BookDTO;
import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.mapper.BookMapper;
import com.devmaster.lesson08.repository.BookRepository;
import com.devmaster.lesson08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;


    @Override
    public List<BookDTO> findAll() {
        return bookMapper.toDTOs(bookRepository.findAll());
    }

    @Override
    public Optional<BookDTO> findById(Long id) {
        return Optional.ofNullable(bookMapper.toDTO(bookRepository.findById(id).orElse(null)));
    }

    @Override
    public BookDTO save(BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        bookRepository.save(book);
        return bookMapper.toDTO(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
