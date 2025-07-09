import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class HoaDonBanhMy {
    private String maHoaDonBanh;
    private String ngayLapHoaDon;
    private String tenKhachHang;
    private String diaChiGiaoHang;
    private int soBanhCanGiao;
    private double giaBanMoiBanh = 15000;
    private double tongTienHang;
    private double tienKhuyenMai = 0;
    private double tongTienPhaiThanhToan;

    public HoaDonBanhMy() {
        this.maHoaDonBanh = UUID.randomUUID().toString();
        this.ngayLapHoaDon = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        nhapHoaDonBanh();
        tinhTienKhuyenMai();
    }

    private void tinhTienKhuyenMai() {
        if (this.soBanhCanGiao >= 100) {
            this.tongTienHang = soBanhCanGiao * giaBanMoiBanh;
            this.tongTienPhaiThanhToan = tongTienHang * 0.2;
            this.tienKhuyenMai = this.tongTienHang - this.tongTienPhaiThanhToan;
        } else if (this.soBanhCanGiao >= 10) {
            this.giaBanMoiBanh = this.giaBanMoiBanh * 0.1;
            this.tongTienHang = this.tongTienPhaiThanhToan = soBanhCanGiao * giaBanMoiBanh;
        } else {
            this.tongTienHang = this.tongTienPhaiThanhToan = soBanhCanGiao * giaBanMoiBanh;
        }
    }

    private void nhapHoaDonBanh() {
        Scanner sc = new Scanner(System.in);
        this.tenKhachHang = sc.nextLine();
        this.diaChiGiaoHang = sc.nextLine();
        this.soBanhCanGiao = sc.nextInt();
    }
}
