package com.devmaster.lab03.service;

import com.devmaster.lab03.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonHocService {
    List<MonHoc> monHocList = new ArrayList<MonHoc>();

    public MonHocService() {
        monHocList.addAll(Arrays.asList(
                new MonHoc("MMH001", "Triết học Mác-Lênin", 90),
                new MonHoc("MMH002", "Xác suất thống kê", 105),
                new MonHoc("MMH003", "Vật lý đại cương", 90),
                new MonHoc("MMH004", "Giáo dục quốc phòng an ninh", 45),
                new MonHoc("MMH005", "Phân tích thiết kế thuật toán", 105)
        ));
    }

    public List<MonHoc> getMonHocList() {
        return monHocList;
    }

    public MonHoc getMonHoc(String maMonHoc) {
        return monHocList.stream().filter(mon -> mon.getMaMonHoc().equals(maMonHoc)).findFirst().orElse(null);
    }

    public MonHoc addMonHoc(MonHoc monHoc) {
        monHocList.add(monHoc);
        return monHoc;
    }

    public MonHoc updateMonHoc(String maMonHoc, MonHoc monHoc) {
        MonHoc check = getMonHoc(maMonHoc);
        if (check == null) {
            return null;
        }

        monHocList.forEach(item -> {
            if (item.getMaMonHoc().equals(maMonHoc)) {
                item.setMaMonHoc(monHoc.getMaMonHoc());
                item.setTenMonHoc(monHoc.getTenMonHoc());
                item.setSoTiet(monHoc.getSoTiet());
            }
        });

        return monHoc;
    }

    public boolean deleteMonHoc(String maMonHoc) {
        MonHoc check = getMonHoc(maMonHoc);
        return monHocList.remove(check);
    }
}
