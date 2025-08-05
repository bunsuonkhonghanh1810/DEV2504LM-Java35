package com.devmaster.lab07.service.impl;

import com.devmaster.lab07.dto.BookDTO;
import com.devmaster.lab07.entity.Book;
import com.devmaster.lab07.mapper.BookMapper;
import com.devmaster.lab07.repository.BookRepository;
import com.devmaster.lab07.service.BookService;
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
        return bookRepository
                .findAll()
                .stream()
                .map(bookMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<BookDTO> findById(Long id) {
        return Optional.ofNullable(bookMapper.toDTO(
                bookRepository.findById(id).orElse(null)
        ));
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
