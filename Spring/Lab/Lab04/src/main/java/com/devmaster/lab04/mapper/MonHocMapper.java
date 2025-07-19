package com.devmaster.lab04.mapper;

import com.devmaster.lab04.dto.MonHocDTO;
import com.devmaster.lab04.entity.MonHoc;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MonHocMapper {
    MonHoc toEntity(MonHocDTO dto);
    MonHocDTO toDto(MonHoc entity);
}
