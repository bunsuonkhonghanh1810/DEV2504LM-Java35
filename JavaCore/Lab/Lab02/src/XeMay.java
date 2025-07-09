import java.util.Scanner;

public class XeMay {
    String ten;
    String nhaSanXuat;
    int soLuongBanhXe;

    public XeMay() {
        nhapThongTin();
        hienThiThongTin();
    }

    private void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten xe: ");
        ten = sc.nextLine();
        System.out.print("Nhap ten nha san xuat: ");
        nhaSanXuat = sc.nextLine();
        System.out.print("Nhap so luong banh: ");
        soLuongBanhXe = sc.nextInt();
        sc.nextLine();
    }

    private void hienThiThongTin() {
        System.out.println("Ten xe: " + ten);
        System.out.println("Nha san xuat: " + nhaSanXuat);
        System.out.println("SoLuong banh: " + soLuongBanhXe);
    }

    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
    }
}
