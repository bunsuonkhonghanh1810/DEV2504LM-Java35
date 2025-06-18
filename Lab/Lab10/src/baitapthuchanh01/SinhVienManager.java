package baitapthuchanh01;

import java.util.Arrays;

public class SinhVienManager {
    String[] arrSinhVien;

    public SinhVienManager() {
        arrSinhVien = new String[0];
    }

    private void moRong() {
        int size = arrSinhVien.length + 1;
        String[] temp = Arrays.copyOf(arrSinhVien, size);
        arrSinhVien = new String[size];
        System.arraycopy(temp, 0, arrSinhVien, 0, size);
    }

    public void themSinhVien(String name, int pos) {
        try {
            arrSinhVien[pos - 1] = name;
        } catch (ArrayIndexOutOfBoundsException e) {
            moRong();
            arrSinhVien[arrSinhVien.length - 1] = name;
        }
    }

    public void hienThi() {
        for (String s: arrSinhVien) {
            System.out.println(s);
        }
    }
}
