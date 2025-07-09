package baitaptulam01;

import java.util.Scanner;

public class PermanentLecturer extends Lecturer {
    private int baseSalary;
    private final int baseLecturingTime = 40;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Base Salary: ");
        baseSalary = sc.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("Base Salary: " + baseSalary);
    }
}
