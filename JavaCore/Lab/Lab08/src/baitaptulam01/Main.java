package baitaptulam01;

import java.util.Scanner;

public class Main {
    private boolean running;

    public Main() {
        running = true;

        while (running) {

        }
    }

    public int getChoice() {
        System.out.println("1. Enter lecturer info\n2. Display lecturer info\n3. Display permanent lecturer info\n4. Display adjunct lecturer info\n5. Calculate total salary\n6. Find the highest salary");
        Scanner in = new Scanner(System.in);

        return in.nextInt();
    }
}
