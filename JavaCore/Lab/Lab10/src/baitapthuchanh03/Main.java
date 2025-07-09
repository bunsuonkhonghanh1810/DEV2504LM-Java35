package baitapthuchanh03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                System.out.println("Phép chia = " + (a / b));
            } catch (ArithmeticException ac) {
                System.out.println("Lỗi tính toán - " + ac.toString());
            }
        } catch (InputMismatchException ime) {
            System.out.println("Dữ liệu nhập không hợp lệ - " + ime.toString());
        } finally {
            System.out.println("Dữ liệu nhập an toàn!");
        }
    }
}
