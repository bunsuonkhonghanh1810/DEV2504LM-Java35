import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercise04 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("N is not a prime number");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("N is a prime number");
        }
    }
}
