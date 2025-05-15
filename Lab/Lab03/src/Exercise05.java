import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            if (i == 1) System.out.println(" ".repeat(n - i ) + "*");
            else if (i == n) System.out.println("*".repeat(n * 2 - 1));
            else System.out.println(" ".repeat(n - i) + "*" + " ".repeat(2 * i - 3) + "*");
        }
    }
}
