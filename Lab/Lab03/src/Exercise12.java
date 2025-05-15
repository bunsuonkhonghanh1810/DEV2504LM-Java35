import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();

        int a = 1, b = 2;
        System.out.print(a + " ");
        while (b <= n) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
