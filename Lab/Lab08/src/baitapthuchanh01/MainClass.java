package baitapthuchanh01;

import java.util.Scanner;

public class MainClass {
    public int showMenu() {
        System.out.println("|===============MENU==============");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate area of rectangle");
        System.out.println("3. Calculate area of triangle");
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    public void calcArea(Shape s) {
        s.inputData();
        s.calArea();
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();
        int choice = 0;

        do {
            choice = main.showMenu();
            switch (choice) {
                case 1:
                    main.calcArea(new Circle());
                    break;
                case 2:
                    main.calcArea(new Rectangle());
                    break;
                case 3:
                    main.calcArea(new Triangle());
                    break;
            }
        } while (choice > 0 && choice < 4);
    }
}
