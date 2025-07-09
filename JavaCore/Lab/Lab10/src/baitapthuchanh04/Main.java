package baitapthuchanh04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String number = null;
            Scanner sc = new Scanner(System.in);
            String temp = null;
            if (!(temp = sc.nextLine()).isEmpty()) {
                number = temp;
            }
            System.out.println("temp = [" + temp + "]");
            float realNum = Float.parseFloat(number);
            System.out.println("realNum: " + realNum);
            System.out.println("divide = " + (10 / (int)realNum));
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of program");
        }
    }
}
