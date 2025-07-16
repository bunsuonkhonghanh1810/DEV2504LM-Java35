package com.devmaster.lab03.service;

import com.devmaster.lab03.entity.Khoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KhoaService {
    List<Khoa> khoaList = new ArrayList<Khoa>();

    public KhoaService() {
        khoaList.addAll(Arrays.asList(
                new Khoa("MK001", "Cng nghệ thông tin"),
                new Khoa("MK002", "Vận tải kinh tế"),
                new Khoa("MK003", "Cơ khí"),
                new Khoa("MK004", "Lý luâận chính trị"),
                new Khoa("MK005", "Quản lý xây dựng")
        ));
    }

    public List<Khoa> getKhoaList() {
        return khoaList;
    }

    public Khoa getKhoa(String maKhoa) {
        return khoaList.stream().filter(khoa -> khoa.getMaKhoa().equals(maKhoa)).findFirst().orElse(null);
    }

    public Khoa addKhoa(Khoa khoa) {
        khoaList.add(khoa);
        return khoa;
    }

    public Khoa updateKhoa(String maKhoa, Khoa khoa) {
        Khoa check = getKhoa(maKhoa);
        if (check == null) {
            return null;
        }

        khoaList.forEach(item -> {
            if (item.getMaKhoa().equals(maKhoa)) {
                item.setMaKhoa(khoa.getMaKhoa());
                item.setTenKhoa(khoa.getTenKhoa());
            }
        });

        return khoa;
    }

    public boolean deleteKhoa(String maKhoa) {
        Khoa check = getKhoa(maKhoa);
        return khoaList.remove(check);
    }
}
