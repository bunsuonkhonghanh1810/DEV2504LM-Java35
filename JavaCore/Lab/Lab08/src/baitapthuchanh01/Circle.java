package baitapthuchanh01;

import java.util.Scanner;

public class Circle extends Shape {
    float radis;

    @Override
    public void inputData() {
        System.out.println("Enter radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        radis = sc.nextFloat();
    }

    @Override
    public void calArea() {
        float area = (float)(radis * radis * Math.PI);
        System.out.println("The area of the circle is " + area);
    }
}
