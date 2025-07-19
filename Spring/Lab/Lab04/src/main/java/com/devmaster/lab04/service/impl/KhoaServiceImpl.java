package com.devmaster.lab04.service.impl;

import com.devmaster.lab04.dto.KhoaDTO;
import com.devmaster.lab04.entity.Khoa;
import com.devmaster.lab04.mapper.KhoaMapper;
import com.devmaster.lab04.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KhoaServiceImpl implements KhoaService {

    private List<Khoa> khoaList = new ArrayList<Khoa>();

    @Autowired
    private KhoaMapper khoaMapper;

    public KhoaServiceImpl() {
        khoaList.addAll(Arrays.asList(
                new Khoa("MK001", "Cng nghệ thông tin"),
                new Khoa("MK002", "Vận tải kinh tế"),
                new Khoa("MK003", "Cơ khí"),
                new Khoa("MK004", "Lý luận chính trị"),
                new Khoa("MK005", "Quản lý xây dựng")
        ));
    }

    @Override
    public List<KhoaDTO> getAllKhoa() {
        return khoaList.stream()
                .map(khoaMapper::toDto)
                .toList();
    }

    @Override
    public KhoaDTO getKhoaByMaKhoa(String maKhoa) {
        return khoaList.stream()
                .map(khoaMapper::toDto)
                .filter(khoaDTO -> khoaDTO.getMaKhoa().equals(maKhoa))
                .findFirst()
                .orElse(null);
    }

    @Override
    public KhoaDTO addKhoa(KhoaDTO khoaDTO) {
        Khoa khoa = khoaMapper.toEntity(khoaDTO);
        khoaList.add(khoa);

        return khoaMapper.toDto(khoa);
    }

    @Override
    public KhoaDTO updateKhoa(String maKhoa, KhoaDTO khoaDTO) {
        for (int i = 0; i < khoaList.size(); i++) {
            if (khoaList.get(i).getMaKhoa().equals(maKhoa)) {
                Khoa updated = khoaMapper.toEntity(khoaDTO);
                khoaList.set(i, updated);
                return khoaMapper.toDto(updated);
            }
        }

        return null;
    }

    @Override
    public void deleteKhoa(String maKhoa) {
        khoaList.removeIf(khoa -> khoa.getMaKhoa().equals(maKhoa));
    }
}
