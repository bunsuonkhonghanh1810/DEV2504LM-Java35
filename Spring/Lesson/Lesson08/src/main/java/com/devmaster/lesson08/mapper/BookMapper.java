package com.devmaster.lesson08.mapper;

import com.devmaster.lesson08.dto.BookDTO;
import com.devmaster.lesson08.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AuthorMapper.class})
public interface BookMapper {
    BookDTO toDTO(Book book);
    Book toEntity(BookDTO bookDTO);
    List<BookDTO> toDTOs(List<Book> books);
    List<Book> toEntities(List<BookDTO> bookDTOs);
}