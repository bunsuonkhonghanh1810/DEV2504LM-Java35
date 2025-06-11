package baitaptulam1.vehicle;

import java.util.Scanner;

public class Vehicles implements IVehicle {
    String maker;
    String model;
    double price;

    public Vehicles() {}

    public Vehicles(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        maker = sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Maker: " + maker);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
