package com.devmaster.lab08.service.impl;

import com.devmaster.lab08.dto.ProductConfigDTO;
import com.devmaster.lab08.entity.ProductConfig;
import com.devmaster.lab08.mapper.ProductConfigMapper;
import com.devmaster.lab08.mapper.ProductMapper;
import com.devmaster.lab08.repository.ProductConfigRepository;
import com.devmaster.lab08.service.ProductConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductConfigServiceImpl implements ProductConfigService {

    @Autowired
    private ProductConfigRepository productConfigRepository;

    @Autowired
    private ProductConfigMapper productConfigMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductConfigDTO> findAll() {
        return productConfigRepository
                .findAll()
                .stream()
                .map(productConfigMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<ProductConfigDTO> findById(Long id) {
        return Optional.of(
                productConfigMapper.toDTO(productConfigRepository.findById(id).orElse(null))
        );
    }

    @Override
    public ProductConfigDTO save(ProductConfigDTO productConfigDTO) {
        ProductConfig productConfig = productConfigMapper.toEntity(productConfigDTO);
        return productConfigMapper.toDTO(productConfigRepository.save(productConfig));
    }

    @Override
    public void deleteById(Long id) {
        productConfigRepository.deleteById(id);
    }
}
