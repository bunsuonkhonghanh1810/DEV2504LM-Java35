import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String address;
    int age;
    double salary;

    public Customer() {}

    public Customer(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter address : ");
        address = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter salary : ");
        salary = sc.nextDouble();
        sc.close();
    }

    public void input(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public void viewData() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    public double calSalary(double bonus) {
        return salary + salary * bonus;
    }

    public double calSalary(int bonus) {
        return salary + salary * ((double) bonus / 100);
    }
}
