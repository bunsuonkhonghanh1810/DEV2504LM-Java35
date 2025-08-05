package com.devmaster.lab07.service;

import com.devmaster.lab07.dto.CategoryDTO;
import com.devmaster.lab07.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryDTO> findAll();
    Optional<CategoryDTO> findById(Long id);
    CategoryDTO save(CategoryDTO categoryDTO);
    void deleteById(Long id);
}
