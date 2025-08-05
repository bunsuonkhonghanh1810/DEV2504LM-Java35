package com.devmaster.lab08.service;

import com.devmaster.lab08.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDTO> findAll();
    Optional<ProductDTO> findById(Long id);
    ProductDTO save(ProductDTO productDTO);
    void deleteById(Long id);
}
