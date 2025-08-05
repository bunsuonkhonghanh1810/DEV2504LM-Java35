package com.devmaster.lesson08.dto;

import com.devmaster.lesson08.entity.Book;
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
public class AuthorDTO {
    Long id;
    String code;
    String name;
    String description;
    String imgUrl;
    String email;
    String phone;
    String address;
    Boolean isActive;

    List<BookDTO> books = new ArrayList<>();
}
