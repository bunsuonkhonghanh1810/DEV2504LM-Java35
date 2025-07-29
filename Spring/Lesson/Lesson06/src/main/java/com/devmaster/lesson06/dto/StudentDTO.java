package com.devmaster.lesson06.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class StudentDTO {
    Long id;
    String name;
    String email;
    int age;
}
