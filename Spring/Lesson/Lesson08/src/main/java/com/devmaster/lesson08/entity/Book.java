package com.devmaster.lesson08.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    String name;
    String description;
    String imgUrl;
    Integer quantity;
    Double price;
    Boolean isActive;

    @ManyToMany
    @JoinTable(
            name = "Book_Author",
            joinColumns = @JoinColumn(name = "bookId"),
            inverseJoinColumns = @JoinColumn(name = "authorId")
    )
    List<Author> authors = new ArrayList<>();
}
