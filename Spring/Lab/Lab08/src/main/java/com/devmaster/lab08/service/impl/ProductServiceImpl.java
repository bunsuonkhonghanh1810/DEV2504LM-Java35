package com.devmaster.lab08.service.impl;

import com.devmaster.lab08.dto.ProductDTO;
import com.devmaster.lab08.entity.Product;
import com.devmaster.lab08.mapper.ProductMapper;
import com.devmaster.lab08.repository.ProductRepository;
import com.devmaster.lab08.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductDTO> findAll() {
        return productRepository
                .findAll()
                .stream()
                .map(productMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<ProductDTO> findById(Long id) {
        return Optional.ofNullable(
                productMapper.toDTO(productRepository.findById(id).orElse(null))
        );
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = productMapper.toEntity(productDTO);
        return productMapper.toDTO(productRepository.save(product));
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
