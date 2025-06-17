package baitapthuchanh02;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoKhau {
    private ArrayList<SoHoKhau> tapSoHoKhau;

    public int showMenu() {
        System.out.println("|===============Menu==============");
        System.out.println("1. Khai bao so ho khau");
        System.out.println("2. Danh sach so ho khau");
        System.out.println("3. Tim nguoi");

        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so ho can khai bao");
        int soHoCanKhaiBao = input.nextInt();
        tapSoHoKhau = new ArrayList<>();
        for (int i = 0; i < soHoCanKhaiBao; i++) {
            System.out.println("Nhap so nhan khau ho thu " + i);
            SoHoKhau soHoKhau = new SoHoKhau(input.nextInt());
            soHoKhau.nhap();
            tapSoHoKhau.add(soHoKhau);
        }
    }


}
