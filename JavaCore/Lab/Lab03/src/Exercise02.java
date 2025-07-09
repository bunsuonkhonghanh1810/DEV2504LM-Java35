import java.util.Scanner;

public class Exercise02 {
    private int n;

    private void nInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = sc.nextInt();
        sc.close();
    }

    private int sum1ToN() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public Exercise02() {
        nInput();
    }

    public Exercise02(int n) {this.n = n;}

    public static void main(String[] args) {
        int sum = new Exercise02(7).sum1ToN();
        System.out.println(sum);
    }
}
