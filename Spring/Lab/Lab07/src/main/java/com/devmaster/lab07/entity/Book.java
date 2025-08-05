package com.devmaster.lab07.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "books")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imgUrl;
    Integer quantity;
    Double price;
    Integer yearReleased;
    String author;
    Boolean status;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    Category category;
}
