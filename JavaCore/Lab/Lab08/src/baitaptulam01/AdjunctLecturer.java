package baitaptulam01;

import java.util.Scanner;

public class AdjunctLecturer extends Lecturer {
    private String workplace;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Workplace: ");
        workplace = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Workplace: " + workplace);
    }
}
