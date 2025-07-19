package com.devmaster.lab04.mapper;

import com.devmaster.lab04.dto.EmployeeDTO;
import com.devmaster.lab04.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee toEntity(EmployeeDTO dto);

    EmployeeDTO toDTO(Employee entity);
}
