package com.devmaster.lab06.service.impl;

import com.devmaster.lab06.dto.CustomerDTO;
import com.devmaster.lab06.entity.Customer;
import com.devmaster.lab06.mapper.CustomerMapper;
import com.devmaster.lab06.repository.CustomerRepository;
import com.devmaster.lab06.service.CustomerService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<CustomerDTO> findById(Long id) {
        Customer customer = customerRepository
                .findById(id)
                .orElse(null);
        CustomerDTO customerDTO = customerMapper.toDTO(customer);

        return Optional.of(customerDTO);
    }

    @Override
    public Boolean save(CustomerDTO customerDTO) {
        Customer customer = customerMapper.toEntity(customerDTO);
        try {
            customerRepository.save(customer);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Customer update(Long id, CustomerDTO customerDTO) {
        return customerRepository
                .findById(id)
                .map(customer -> {
                    customerMapper.updateCustomerFromDto(customerDTO, customer);
                    return customerRepository.save(customer);
                })
                .orElseThrow(() -> new IllegalStateException("Invalid customer ID: " + id));
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
