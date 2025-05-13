import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;

    public Person() {}

    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }

    private void view() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Person p = new Person();
    }
}
