package com.devmaster.lesson08.mapper;

import com.devmaster.lesson08.dto.AuthorDTO;
import com.devmaster.lesson08.entity.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDTO toDTO(Author author);
    Author toEntity(AuthorDTO authorDTO);
    List<AuthorDTO> toDTOs(List<Author> authors);
    List<Author> toEntities(List<AuthorDTO> authorDTOs);
}
