package com.devmaster.lab08.service.impl;

import com.devmaster.lab08.dto.ConfigurationDTO;
import com.devmaster.lab08.entity.Configuration;
import com.devmaster.lab08.mapper.ConfigurationMapper;
import com.devmaster.lab08.repository.ConfigurationRepository;
import com.devmaster.lab08.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    private ConfigurationRepository configurationRepository;

    @Autowired
    private ConfigurationMapper configurationMapper;

    @Override
    public List<ConfigurationDTO> findAll() {
        return configurationRepository
                .findAll()
                .stream()
                .map(configurationMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<ConfigurationDTO> findById(Long id) {
        return Optional.ofNullable(
                configurationMapper.toDTO(configurationRepository.findById(id).orElse(null))
        );
    }

    @Override
    public ConfigurationDTO save(ConfigurationDTO configurationDTO) {
        Configuration configuration = configurationMapper.toEntity(configurationDTO);
        return configurationMapper.toDTO(configurationRepository.save(configuration));
    }

    @Override
    public void deleteById(Long id) {
        configurationRepository.deleteById(id);
    }
}
