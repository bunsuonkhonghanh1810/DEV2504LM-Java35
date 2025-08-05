package com.devmaster.lab07.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class BookDTO {
    Long id;
    String name;
    String imgUrl;
    Integer quantity;
    Double price;
    Integer yearReleased;
    String author;
    Boolean status;

    CategoryDTO category;
}
