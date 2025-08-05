package com.devmaster.lesson08.service;

import com.devmaster.lesson08.dto.AuthorDTO;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<AuthorDTO> findAll();
    Optional<AuthorDTO> findById(Long id);
    AuthorDTO save(AuthorDTO authorDTO);
    void deleteById(Long id);
    List<AuthorDTO> findAllById(List<Long> ids);
}
