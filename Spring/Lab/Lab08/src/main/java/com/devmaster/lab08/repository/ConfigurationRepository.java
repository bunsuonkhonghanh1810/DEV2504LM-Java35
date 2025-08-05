package com.devmaster.lab08.repository;

import com.devmaster.lab08.entity.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
}
