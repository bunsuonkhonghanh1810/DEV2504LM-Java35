package baitaptulam1.vehicle.test;

import baitaptulam1.vehicle.Vehicles;
import baitaptulam1.vehicle.car.Car;
import baitaptulam1.vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0;
        boolean run = true;

        ArrayList<Car> cars = new ArrayList<Car>();
        ArrayList<Truck> trucks = new ArrayList<Truck>();

        while (run) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Input\n2. Display\n3. Sort by price\n4. Search by model\n5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cars.removeAll(cars);
                    trucks.removeAll(trucks);

                    for (int i = 0; i < 3; i++) {
                        Car car = new Car();
                        car.input();
                        cars.add(car);
                    }
                    for (int i = 0; i < 3; i++) {
                        Truck truck = new Truck();
                        truck.input();
                        trucks.add(truck);
                    }
                    break;
                case 2:
                    if (!cars.isEmpty()) {
                        for (Car car : cars) {
                            car.display();
                        }
                        for (Truck truck : trucks) {
                            truck.display();
                        }
                    } else System.out.println("Please enter cars and trucks info");

                    break;
                case 3:
                    if (!trucks.isEmpty()) {
                        ArrayList<Vehicles> vehicles = new ArrayList<Vehicles>();
                        vehicles.addAll(cars);
                        vehicles.addAll(trucks);

                        for (Vehicles vehicle : vehicles) {
                            vehicle.display();
                        }

                        for (int i = 0; i < vehicles.size() - 1; i++) {
                            for (int j = i + 1; j < vehicles.size() - i - 1; j++) {
                                if (vehicles.get(j).getPrice() > vehicles.get(j + 1).getPrice()) {
                                    Vehicles temp = vehicles.get(j);
                                    vehicles.set(j, vehicles.get(j + 1));
                                    vehicles.set(j + 1, temp);
                                }
                            }
                        }
                    } else System.out.println("Please enter cars and trucks info");

                    break;
                case 4:
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
    }
}
