package baitapthuchanh02;

import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;

    public NhanKhau() {}

    public NhanKhau(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Gioi tinh: ");
        gioiTinh = sc.nextLine();
    }

    public void hienThi() {
        System.out.println(hoTen);
        System.out.println(ngaySinh);
        System.out.println(gioiTinh);
    }
}
