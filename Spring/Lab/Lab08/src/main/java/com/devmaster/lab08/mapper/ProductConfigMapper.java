package com.devmaster.lab08.mapper;

import com.devmaster.lab08.dto.ProductConfigDTO;
import com.devmaster.lab08.entity.ProductConfig;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProductMapper.class, ConfigurationMapper.class})
public interface ProductConfigMapper {
    ProductConfig toEntity(ProductConfigDTO productConfigDTO);
    ProductConfigDTO toDTO(ProductConfig productConfig);
}
