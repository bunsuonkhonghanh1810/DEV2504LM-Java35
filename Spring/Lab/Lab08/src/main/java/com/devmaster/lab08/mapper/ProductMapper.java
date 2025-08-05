package com.devmaster.lab08.mapper;

import com.devmaster.lab08.dto.ProductDTO;
import com.devmaster.lab08.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDTO productDTO);
    ProductDTO toDTO(Product product);
}
