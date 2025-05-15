import java.util.Scanner;

public class Exercise03 {
    double firstNum, secondNum;
    double GCD, LCM;

    private void inputNums() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNum = sc.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = sc.nextDouble();
        sc.close();
    }

    private double calGCD(double a, double b) {
        if (b == 0)
            return a;
        return calGCD(b, a % b);
    }

    private double calLCM(double a, double b) {
        return (a * b) / (this.GCD);
    }

    private double getFirstNum() {
        return firstNum;
    }

    private double getSecondNum() {
        return secondNum;
    }

    private double getGCD() {
        return GCD;
    }

    private double getLCM() {
        return LCM;
    }

    public Exercise03() {
        inputNums();
        GCD = calGCD(firstNum, secondNum);
        LCM = calLCM(firstNum, secondNum);
    }

    public static void main(String[] args) {
        Exercise03 ex = new Exercise03();
        double GCD = ex.getGCD();
        double LCM = ex.getLCM();

        System.out.println(GCD + " " + LCM);
    }
}
