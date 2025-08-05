package com.devmaster.lab07.mapper;

import com.devmaster.lab07.dto.CategoryDTO;
import com.devmaster.lab07.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toEntity(CategoryDTO dto);
    CategoryDTO toDTO(Category entity);
}
