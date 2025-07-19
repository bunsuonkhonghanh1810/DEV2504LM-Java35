package com.devmaster.lab04.service.impl;

import com.devmaster.lab04.dto.MonHocDTO;
import com.devmaster.lab04.entity.MonHoc;
import com.devmaster.lab04.mapper.MonHocMapper;
import com.devmaster.lab04.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonHocServiceImpl implements MonHocService {

    private List<MonHoc> monHocList = new ArrayList<MonHoc>();

    @Autowired
    private MonHocMapper monHocMapper;

    public MonHocServiceImpl() {
        monHocList.addAll(Arrays.asList(
                new MonHoc("01", "Triết học Mác-Lênin", 45),
                new MonHoc("02", "Xác suất thống kê", 75),
                new MonHoc("03", "Vật lý đại cương", 75),
                new MonHoc("04", "Giáo dục quốc phòng an ninh", 45),
                new MonHoc("05", "Phân tích thiết kế thuật toán", 75)
        ));
    }

    @Override
    public List<MonHocDTO> getAllMonHoc() {
        return monHocList.stream()
                .map(monHocMapper::toDto)
                .toList();
    }

    @Override
    public MonHocDTO getMonHocByMaMonHoc(String maMonHoc) {
        return monHocList.stream()
                .filter(monHoc -> monHoc.getMaMonHoc().equals(maMonHoc))
                .findFirst()
                .map(monHocMapper::toDto)
                .orElse(null);
    }

    @Override
    public MonHocDTO addMonHoc(MonHocDTO monHocDTO) {
        MonHoc monHoc = monHocMapper.toEntity(monHocDTO);
        monHocList.add(monHoc);

        return monHocMapper.toDto(monHoc);
    }

    @Override
    public MonHocDTO updateMonHoc(String maMonHoc, MonHocDTO monHocDTO) {
        for (int i = 0; i < monHocList.size(); i++) {
            if (monHocList.get(i).getMaMonHoc().equals(maMonHoc)) {
                MonHoc updated = monHocMapper.toEntity(monHocDTO);
                monHocList.set(i, updated);
                return monHocMapper.toDto(updated);
            }
        }

        return null;
    }

    @Override
    public void deleteMonHoc(String maMonHoc) {
        monHocList.removeIf(monHoc -> monHoc.getMaMonHoc().equals(maMonHoc));
    }
}
