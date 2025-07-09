package maytinh;

import java.util.Scanner;

public class Maytinh implements IMaytinh {
    private String code;
    private String name;
    private double price;

    public Maytinh(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Maytinh() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Input code: ");
        code = sc.nextLine();
        System.out.print("- Input name: ");
        name = sc.nextLine();
        System.out.print("- Input price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void displayInfor() {
        System.out.println("- Code: " + code);
        System.out.println("- Name: " + name);
        System.out.println("- Price: " + price);
    }

    @Override
    public void changeInfor() {}
}
