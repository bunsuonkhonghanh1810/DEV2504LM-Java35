import java.util.Scanner;

public class MainClass {
    void inputCustomorData(Customer nv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        nv.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        nv.name = sc.nextLine();
        System.out.print("Enter address : ");
        nv.address = sc.nextLine();
        System.out.print("Enter age : ");
        nv.age = sc.nextInt();
        System.out.print("Enter salary : ");
        nv.salary = sc.nextDouble();
        sc.close();
    }

    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();

        MainClass main = new MainClass();
        main.inputCustomorData(customer01);
        main.inputCustomorData(customer02);

        customer01.viewData();
        customer02.viewData();

        System.out.println(customer01.calSalary(15));
        System.out.println(customer02.calSalary((float) 690000));
    }
}
