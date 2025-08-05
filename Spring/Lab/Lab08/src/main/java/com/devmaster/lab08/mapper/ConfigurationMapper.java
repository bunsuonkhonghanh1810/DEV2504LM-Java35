package com.devmaster.lab08.mapper;

import com.devmaster.lab08.dto.ConfigurationDTO;
import com.devmaster.lab08.entity.Configuration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConfigurationMapper {
    Configuration toEntity(ConfigurationDTO configurationDTO);
    ConfigurationDTO toDTO(Configuration configuration);
}
