import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bài 1
        System.out.println("Bài 1");
        System.out.println("Hello, this is my first application");

        // Bài 2
        System.out.println("\nBài 2");
        System.out.print("Nhập số nguyên: ");
        int num = scanner.nextInt();
        System.out.println("Số vừa nhập là: " + num);

        // Bài 3
        System.out.println("\nBài 3");
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số thực m: ");
        double m = scanner.nextDouble();
        System.out.println("Giá trị n vừa nhập: " + n);
        System.out.println("Giá trị m vừa nhập: " + m);

        // Bài 4
        System.out.println("\nBài 4");
        System.out.print("Nhập số nguyên: ");
        int soNguyen = scanner.nextInt();
        System.out.print("Nhập số thực: ");
        double soThuc = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập một xâu ký tự: ");
        String xau = scanner.nextLine();
        System.out.println("Số nguyên: " + soNguyen);
        System.out.println("Số thực: " + soThuc);
        System.out.println("Xâu ký tự: " + xau);

        // Bài 5
        System.out.println("\nBài 5");
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        int tong = a + b;
        System.out.println("Tổng hai số là: " + tong);

        // Bài 6
        System.out.println("\nBài 6");
        System.out.print("Nhập số nguyên n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Nhập số thực m1: ");
        double m1 = scanner.nextDouble();
        System.out.print("Nhập số nguyên n2: ");
        int n2 = scanner.nextInt();
        System.out.print("Nhập số thực m2: ");
        double m2 = scanner.nextDouble();
        int tongNguyen = n1 + n2;
        double tongThuc = m1 + m2;
        double tongAll = n1 + n2 + m1 + m2;
        System.out.println("Tổng hai số nguyên: " + tongNguyen);
        System.out.println("Tổng hai số thực: " + tongThuc);
        System.out.println("Tổng tất cả: " + tongAll);

        // Bài 7
        System.out.println("\nBài 7");
        System.out.print("Nhập số thứ nhất: ");
        int so1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int so2 = scanner.nextInt();
        int max2 = Math.max(so1, so2);
        int min2 = Math.min(so1, so2);
        System.out.println("Max: " + max2);
        System.out.println("Min: " + min2);

        // Bài 8
        System.out.println("\nBài 8");
        System.out.print("Nhập số thứ nhất: ");
        int s1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int s2 = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int s3 = scanner.nextInt();
        int max3 = Math.max(s1, Math.max(s2, s3));
        int min3 = Math.min(s1, Math.min(s2, s3));
        System.out.println("Max: " + max3);
        System.out.println("Min: " + min3);

        // Bài 9
        System.out.println("\nBài 9: Giải phương trình bậc nhất ax + b = 0");
        System.out.print("Nhập a: ");
        double a1 = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b1 = scanner.nextDouble();
        if (a1 == 0) {
            if (b1 == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        } else {
            double x = -b1 / a1;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }

        // Bài 10
        System.out.println("\nBài 10: Giải phương trình bậc hai ax² + bx + c = 0");
        System.out.print("Nhập a: ");
        double aa = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double bb = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double cc = scanner.nextDouble();

        if (aa == 0) {
            if (bb == 0) {
                if (cc == 0)
                    System.out.println("Phương trình vô số nghiệm");
                else
                    System.out.println("Phương trình vô nghiệm");
            } else {
                double x = -cc / bb;
                System.out.println("Phương trình có một nghiệm x = " + x);
            }
        } else {
            double delta = bb * bb - 4 * aa * cc;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -bb / (2 * aa);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-bb + Math.sqrt(delta)) / (2 * aa);
                double x2 = (-bb - Math.sqrt(delta)) / (2 * aa);
                System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
            }
        }

        scanner.close();
    }
}