import java.util.Scanner;

public class SinhVien {
    String ten;
    String msv;
    double diemLyThuyetJava;
    double diemThucHanhJava;

    public SinhVien() {}

    private void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        ten = sc.nextLine();
        System.out.print("Nhập mã sinh viên: ");
        msv = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết môn Java: ");
        diemLyThuyetJava = sc.nextDouble();
        System.out.print("Nhập điểm thực hành môn Java: ");
        diemThucHanhJava = sc.nextDouble();
        sc.close();
    }

    private void hienThiThongTin() {
        if (diemLyThuyetJava < 4) {
            System.out.println("Thi lại lý thuyết Java");
        }
        if (diemThucHanhJava < 4) {
            System.out.println("Thi lại thực hành");
        }

    }

    public static void main(String[] args) {

    }
}
