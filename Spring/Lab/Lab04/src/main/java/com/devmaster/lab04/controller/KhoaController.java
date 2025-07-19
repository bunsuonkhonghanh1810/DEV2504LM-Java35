package com.devmaster.lab04.controller;

import com.devmaster.lab04.dto.KhoaDTO;
import com.devmaster.lab04.entity.Khoa;
import com.devmaster.lab04.service.KhoaService;
import com.devmaster.lab04.service.impl.KhoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KhoaController {

    @Autowired
    private KhoaService khoaService;

    @GetMapping("/khoa-list")
    public List<KhoaDTO> khoaList() {
        return khoaService.getAllKhoa();
    }

    @GetMapping("/khoa/{maKhoa}")
    public KhoaDTO khoa(@PathVariable String maKhoa) {
        return khoaService.getKhoaByMaKhoa(maKhoa);
    }

    @PostMapping("/add-khoa")
    public KhoaDTO addKhoa(@RequestBody KhoaDTO khoaDTO) {
        return khoaService.addKhoa(khoaDTO);
    }

    @PutMapping("/update-khoa/{maKhoa}")
    public KhoaDTO updateKhoa(@PathVariable String maKhoa, @RequestBody KhoaDTO khoaDTO) {
        return khoaService.updateKhoa(maKhoa, khoaDTO);
    }

    @DeleteMapping("/delete-khoa/{maKhoa}")
    public void deleteKhoa(@PathVariable String maKhoa) {
        khoaService.deleteKhoa(maKhoa);
    }
}
