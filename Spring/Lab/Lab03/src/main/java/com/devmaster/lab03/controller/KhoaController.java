package com.devmaster.lab03.controller;

import com.devmaster.lab03.entity.Khoa;
import com.devmaster.lab03.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @GetMapping("/khoa-list")
    public List<Khoa> khoaList() {
        return khoaService.getKhoaList();
    }

    @GetMapping("/khoa/{maKhoa}")
    public Khoa khoa(@PathVariable String maKhoa) {
        return khoaService.getKhoa(maKhoa);
    }

    @PostMapping("/add-khoa")
    public Khoa addKhoa(@RequestBody Khoa khoa) {
        return khoaService.addKhoa(khoa);
    }

    @PutMapping("/update-khoa/{maKhoa}")
    public Khoa updateKhoa(@PathVariable String maKhoa, @RequestBody Khoa khoa) {
        return khoaService.updateKhoa(maKhoa, khoa);
    }

    @DeleteMapping("/delete-khoa/{maKhoa}")
    public boolean deleteKhoa(@PathVariable String maKhoa) {
        return khoaService.deleteKhoa(maKhoa);
    }
}
