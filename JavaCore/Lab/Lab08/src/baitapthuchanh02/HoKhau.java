package baitapthuchanh02;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
    private String diaChiHienTai;
    private String noiCongTac;

    public HoKhau() {
        super();
    }

    public HoKhau(String hoTen, String ngaySinh, String gioiTinh, String diaChiHienTai, String noiCongTac) {
        super(hoTen, ngaySinh, gioiTinh);
        this.diaChiHienTai = diaChiHienTai;
        this.noiCongTac = noiCongTac;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia chi hien tai: ");
        diaChiHienTai = sc.nextLine();
        System.out.println("Noi cong tac: ");
        noiCongTac = sc.nextLine();
    }

    public void hienThi() {
        super.hienThi();
        System.out.println(diaChiHienTai);
        System.out.println(noiCongTac);
    }
}
