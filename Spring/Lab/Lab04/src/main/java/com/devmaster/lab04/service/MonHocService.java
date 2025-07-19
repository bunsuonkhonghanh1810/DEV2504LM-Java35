package com.devmaster.lab04.service;

import com.devmaster.lab04.dto.MonHocDTO;

import java.util.List;

public interface MonHocService {
    List<MonHocDTO> getAllMonHoc();
    MonHocDTO getMonHocByMaMonHoc(String maMonHoc);
    MonHocDTO addMonHoc(MonHocDTO monHocDTO);
    MonHocDTO updateMonHoc(String maMonHoc, MonHocDTO monHocDTO);
    void deleteMonHoc(String maMonHoc);
}
