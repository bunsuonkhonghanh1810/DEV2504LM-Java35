package com.devmaster.lesson08.dto;

import com.devmaster.lesson08.entity.Author;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDTO {
    Long id;
    String code;
    String name;
    String description;
    String imgUrl;
    Integer quantity;
    Double price;
    Boolean isActive;

    List<AuthorDTO> authors = new ArrayList<>();
}
