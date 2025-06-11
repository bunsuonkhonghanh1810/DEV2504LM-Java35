public class NhanVienMainClass {
    public static void main(String[] args) {
        NhanVien[] nv = new NhanVien[3];

        nv[0] = new NhanVien();
        nv[0].name = "Ngoc Trinh";
        nv[0].cnt++;

        nv[1] = new NhanVien();
        nv[1].name = "Ba Tung";
        nv[1].cnt++;

        nv[2] = new NhanVien();
        nv[2].name = "Kieu Max";
        nv[2].cnt++;

        for (int i = 0; i < nv.length; i++) {
            NhanVien nvTemp = nv[i];
            System.out.println(nvTemp.name + " " + nvTemp.cnt);
        }
    }
}
