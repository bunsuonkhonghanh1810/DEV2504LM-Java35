package com.devmaster.lab08.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "product_config")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String value;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    Product product;

    @ManyToOne
    @JoinColumn(name = "configId", nullable = false)
    Configuration config;
}
