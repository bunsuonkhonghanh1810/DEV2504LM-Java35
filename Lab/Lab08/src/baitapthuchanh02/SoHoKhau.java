package baitapthuchanh02;

import java.util.ArrayList;

public class SoHoKhau {
     private int soNhanKhau;
     private ArrayList<HoKhau> soHoKhau;

     public SoHoKhau() {}

    public SoHoKhau(int soNhanKhau) {
         this.soNhanKhau = soNhanKhau;
         soHoKhau = new ArrayList<>();
    }

    public void nhap() {
         for (int i = 0; i < soNhanKhau; i++) {
             HoKhau hoKhau = new HoKhau();
             hoKhau.nhap();
             soHoKhau.add(hoKhau);
         }
    }

    public void hienThi() {
         for (int i = 0; i < soNhanKhau; i++) {
             System.out.println("Thanh vien thu " + i);
             soHoKhau.get(i).hienThi();
         }
    }
}
