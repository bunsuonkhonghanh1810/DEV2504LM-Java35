import java.util.Scanner;

public class CustomerManager {
    Customer globalCus = new Customer();

    public void inputCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Customer Age : ");
        int age = sc.nextInt();
        System.out.print("Enter Customer Salary : ");
        double salary = sc.nextDouble();
        sc.close();

        globalCus.input(id, name, address, age, salary);
    }

    public static void main(String[] args) {
        Customer nhanvien = new Customer();
        nhanvien.input();
        nhanvien.viewData();

        CustomerManager manager = new CustomerManager();
        manager.inputCustomer();

        Customer testCom = new Customer(3, "Shin Đông Hiếp", "Gầm cầu", 19, 3500000);
    }
}
