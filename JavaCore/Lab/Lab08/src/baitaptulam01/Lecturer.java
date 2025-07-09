package baitaptulam01;

import java.util.Scanner;

public class Lecturer {
    private String name;
    private String email;
    private String address;
    private String phone;
    private float hoursOfLecturing;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Phone: ");
        phone = sc.nextLine();
        System.out.print("Hours of Lecture: ");
        hoursOfLecturing = sc.nextFloat();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Hours of Lecture: " + hoursOfLecturing);
    }
}
