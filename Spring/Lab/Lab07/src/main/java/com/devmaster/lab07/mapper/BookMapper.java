package com.devmaster.lab07.mapper;

import com.devmaster.lab07.dto.BookDTO;
import com.devmaster.lab07.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface BookMapper {
    Book toEntity(BookDTO dto);
    BookDTO toDTO(Book entity);
}
