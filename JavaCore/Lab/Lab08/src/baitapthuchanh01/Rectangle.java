package baitapthuchanh01;

import java.util.Scanner;

public class Rectangle extends Shape {
    float width;
    float height;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of the rectangle: ");
        width = sc.nextFloat();
        System.out.print("Enter height of the rectangle: ");
        height = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = width * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
