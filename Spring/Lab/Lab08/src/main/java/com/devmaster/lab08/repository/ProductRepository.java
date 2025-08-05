package com.devmaster.lab08.repository;

import com.devmaster.lab08.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
