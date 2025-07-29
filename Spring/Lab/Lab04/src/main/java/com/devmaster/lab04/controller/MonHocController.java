package com.devmaster.lab04.controller;

import com.devmaster.lab04.dto.MonHocDTO;
import com.devmaster.lab04.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonHocController {
    @Autowired
    private MonHocService monHocService;

    @GetMapping("/mon-hoc-list")
    public List<MonHocDTO> monHocList() {
        return monHocService.getAllMonHoc();
    }

    @GetMapping("/mon-hoc/{maMonHoc}")
    public MonHocDTO monHoc(@PathVariable String maMonHoc) {
        return monHocService.getMonHocByMaMonHoc(maMonHoc);
    }

    @PostMapping("/add-mon-hoc")
    public MonHocDTO addMonHoc(@RequestBody MonHocDTO monHocDTO) {
        return monHocService.addMonHoc(monHocDTO);
    }

    @PutMapping("/update-mon-hoc/{maMonHoc}")
    public MonHocDTO updateMonHoc(@PathVariable String maMonHoc, @RequestBody MonHocDTO monHocDTO) {
        return monHocService.updateMonHoc(maMonHoc, monHocDTO);
    }

    @DeleteMapping("/delete-mon-hoc/{maMonHoc}")
    public void deleteMonHoc(@PathVariable String maMonHoc) {
        monHocService.deleteMonHoc(maMonHoc);
    }
}
