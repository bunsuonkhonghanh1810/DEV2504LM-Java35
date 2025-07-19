package com.devmaster.lab04.service;

import com.devmaster.lab04.dto.KhoaDTO;

import java.util.List;

public interface KhoaService {
    List<KhoaDTO> getAllKhoa();
    KhoaDTO getKhoaByMaKhoa(String maKhoa);
    KhoaDTO addKhoa(KhoaDTO khoa);
    KhoaDTO updateKhoa(String maKhoa, KhoaDTO khoaDTO);
    void deleteKhoa(String maKhoa);
}
