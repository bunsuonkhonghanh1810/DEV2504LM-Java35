package com.devmaster.lab07.service.impl;

import com.devmaster.lab07.dto.CategoryDTO;
import com.devmaster.lab07.entity.Category;
import com.devmaster.lab07.mapper.CategoryMapper;
import com.devmaster.lab07.repository.CategoryRepository;
import com.devmaster.lab07.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> findAll() {
        return categoryRepository
                .findAll()
                .stream()
                .map(categoryMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<CategoryDTO> findById(Long id) {
        return Optional.ofNullable(categoryMapper.toDTO(
                categoryRepository.findById(id).orElse(null)
        ));
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toEntity(categoryDTO);
        categoryRepository.save(category);

        return categoryMapper.toDTO(category);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
