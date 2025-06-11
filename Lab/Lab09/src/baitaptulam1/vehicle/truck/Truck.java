package baitaptulam1.vehicle.truck;

import baitaptulam1.vehicle.Vehicles;

import java.util.Scanner;

public class Truck extends Vehicles {
    int truckLoad;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter truck load: ");
        truckLoad = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Truck Load: " + truckLoad);
    }
}
