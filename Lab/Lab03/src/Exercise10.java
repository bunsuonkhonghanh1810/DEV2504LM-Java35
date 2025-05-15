import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
            }
            if (n % (n / i) == 0) {
                sum += n / i;
            }
        }

        if (sum == n) {
            System.out.println("Số hoàn hảo");
        } else {
            System.out.println("Số không hoàn hảo");
        }
    }
}
