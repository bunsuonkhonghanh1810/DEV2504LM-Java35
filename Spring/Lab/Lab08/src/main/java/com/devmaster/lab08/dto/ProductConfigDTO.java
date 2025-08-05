package com.devmaster.lab08.dto;

import com.devmaster.lab08.entity.Configuration;
import com.devmaster.lab08.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductConfigDTO {
    Long id;
    String value;
    Product product;
    Configuration config;
}
