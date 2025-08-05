package com.devmaster.lab07.repository;

import com.devmaster.lab07.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
