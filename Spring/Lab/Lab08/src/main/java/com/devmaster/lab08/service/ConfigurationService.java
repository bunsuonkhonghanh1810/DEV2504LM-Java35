package com.devmaster.lab08.service;

import com.devmaster.lab08.dto.ConfigurationDTO;

import java.util.List;
import java.util.Optional;

public interface ConfigurationService {
    List<ConfigurationDTO> findAll();
    Optional<ConfigurationDTO> findById(Long id);
    ConfigurationDTO save(ConfigurationDTO configurationDTO);
    void deleteById(Long id);
}
