package com.devmaster.lab06.service;

import com.devmaster.lab06.dto.CustomerDTO;
import com.devmaster.lab06.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    Optional<CustomerDTO> findById(Long id);
    Boolean save(CustomerDTO customerDTO);
    Customer update(Long id, CustomerDTO customerDTO);
    void delete(Long id);
}
