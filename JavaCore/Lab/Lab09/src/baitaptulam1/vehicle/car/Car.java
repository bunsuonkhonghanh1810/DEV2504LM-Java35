package baitaptulam1.vehicle.car;

import baitaptulam1.vehicle.Vehicles;

import java.util.Scanner;

public class Car extends Vehicles {
    String color;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}
