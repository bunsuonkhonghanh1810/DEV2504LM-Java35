package baitapthuchanh01;

import java.util.Scanner;

public class Triangle extends Shape {
    float height;
    float bottom;

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextFloat();
        System.out.print("Enter the bottom of the triangle: ");
        bottom = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (height * bottom) / 2;
        System.out.println("The area of the triangle is " + area);
    }
}
