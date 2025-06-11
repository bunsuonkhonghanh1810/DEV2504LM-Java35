package baitaptulam.baitaptulam02;

import java.util.Scanner;

public class Flower {
    private String flowerID;
    private String flowerName;
    private String color;
    private int kindOfFlower;

    public Flower() {}

    public  Flower(String flowerID, String flowerName, String color, int kindOfFlower) {
        this.flowerID = flowerID;
        this.flowerName = flowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public String getFlowerID() {
        return flowerID;
    }

    public void setFlowerID(String flowerID) {
        this.flowerID = flowerID;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        this.flowerID = sc.nextLine();
        this.flowerName = sc.nextLine();
        this.color = sc.nextLine();
        this.kindOfFlower = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.println("Flower ID: " + this.flowerID);
        System.out.println("Flower Name: " + this.flowerName);
        System.out.println("Color: " + this.color);
        System.out.println("Kind of Flower: " + this.kindOfFlower);
    }


}
