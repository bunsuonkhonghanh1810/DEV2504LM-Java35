package com.devmaster.lab08.service;

import com.devmaster.lab08.dto.ProductConfigDTO;

import java.util.List;
import java.util.Optional;

public interface ProductConfigService {
    List<ProductConfigDTO> findAll();
    Optional<ProductConfigDTO> findById(Long id);
    ProductConfigDTO save(ProductConfigDTO productConfigDTO);
    void deleteById(Long id);
}
