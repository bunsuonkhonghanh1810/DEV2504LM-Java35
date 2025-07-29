package com.devmaster.lab06.mapper;

import com.devmaster.lab06.dto.CustomerDTO;
import com.devmaster.lab06.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDTO customerDTO);
    CustomerDTO toDTO(Customer customer);

    @Mapping(target = "id", ignore = true)
    void updateCustomerFromDto(CustomerDTO customerDTO, @MappingTarget Customer customer);
}
