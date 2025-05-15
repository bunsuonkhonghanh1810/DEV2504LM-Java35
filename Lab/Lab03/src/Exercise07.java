import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();

        int sumSquareEven = 0;
        int sumNum = 0;

        for (int i = 1; i <= n; i++) {
            sumNum += i;
            if (i % 2 == 1) {
                System.out.println(i);
                sumSquareEven += i*i;
            }
        }

        System.out.println("Tong binh phuong cac so le: " + sumSquareEven);

        double average = (double) sumNum / n;

        System.out.println("Trung binh cong: " + average);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i > average) {
                System.out.println(i);
            }
        }
    }
}
