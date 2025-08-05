package com.devmaster.lesson08.service.impl;

import com.devmaster.lesson08.dto.AuthorDTO;
import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.mapper.AuthorMapper;
import com.devmaster.lesson08.repository.AuthorRepository;
import com.devmaster.lesson08.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public List<AuthorDTO> findAll() {
        return authorMapper.toDTOs(authorRepository.findAll());
    }

    @Override
    public Optional<AuthorDTO> findById(Long id) {
        return Optional.ofNullable(authorMapper.toDTO(authorRepository.findById(id).orElse(null)));
    }

    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {
        Author author = authorMapper.toEntity(authorDTO);
        authorRepository.save(author);
        return authorMapper.toDTO(author);
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public List<AuthorDTO> findAllById(List<Long> ids) {
        return authorMapper.toDTOs(authorRepository.findAllById(ids));
    }
}
