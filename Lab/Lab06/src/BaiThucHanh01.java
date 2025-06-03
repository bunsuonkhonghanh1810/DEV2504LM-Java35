import java.util.Scanner;

public class BaiThucHanh01 {
    public static void main(String[] args) {
        String[] arrSinhVien = new String[3];
        for (int i = 0; i < arrSinhVien.length; i++) {
            Scanner sc = new Scanner(System.in);
            arrSinhVien[i] = sc.nextLine();
        }
        for (String temp: arrSinhVien) {
            System.out.println(temp);
        }
    }
}
