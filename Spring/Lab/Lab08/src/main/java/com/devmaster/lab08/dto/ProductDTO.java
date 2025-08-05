package com.devmaster.lab08.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductDTO {
    Long id;
    String name;
    String imgUrl;
    Long quantity;
    Double price;
    Boolean isActive;
}
