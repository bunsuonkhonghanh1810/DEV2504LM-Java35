package com.devmaster.lab06.repository;

import com.devmaster.lab06.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
