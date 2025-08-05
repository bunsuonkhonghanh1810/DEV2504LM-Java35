package com.devmaster.lab08.repository;

import com.devmaster.lab08.entity.ProductConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductConfigRepository extends JpaRepository<ProductConfig, Long> {
}
