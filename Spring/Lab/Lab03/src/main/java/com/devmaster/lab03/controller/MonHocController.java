package com.devmaster.lab03.controller;

import com.devmaster.lab03.entity.MonHoc;
import com.devmaster.lab03.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MonHocController {
    @Autowired
    private MonHocService monHocService;

    @GetMapping("/mon-hoc-list")
    public List<MonHoc> monHocList() {
        return monHocService.getMonHocList();
    }

    @GetMapping("/mon-hoc/{maMonHoc}")
    public MonHoc monHoc(@PathVariable String maMonHoc) {
        return monHocService.getMonHoc(maMonHoc);
    }

    @PostMapping("/add-mon-hoc")
    public MonHoc addMonHoc(@RequestBody MonHoc monHoc) {
        return monHocService.addMonHoc(monHoc);
    }

    @PutMapping("/update-mon-hoc/{maMonHoc}")
    public MonHoc updateMonHoc(@PathVariable String maMonHoc, @RequestBody MonHoc monHoc) {
        return monHocService.updateMonHoc(maMonHoc, monHoc);
    }

    @DeleteMapping("/delete-mon-hoc/{maMonHoc}")
    public boolean deleteMonHoc(@PathVariable String maMonHoc) {
        return monHocService.deleteMonHoc(maMonHoc);
    }
}
