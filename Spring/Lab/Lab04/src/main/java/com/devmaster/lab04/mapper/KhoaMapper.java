package com.devmaster.lab04.mapper;

import com.devmaster.lab04.dto.KhoaDTO;
import com.devmaster.lab04.entity.Khoa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KhoaMapper {
    Khoa toEntity(KhoaDTO dto);
    KhoaDTO toDto(Khoa entity);
}
