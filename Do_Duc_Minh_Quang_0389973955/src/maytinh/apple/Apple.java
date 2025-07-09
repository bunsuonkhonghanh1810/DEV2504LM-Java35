package maytinh.apple;

import maytinh.Maytinh;

import java.util.Scanner;

public class Apple extends Maytinh {
    int warranty;

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner sc = new Scanner(System.in);
        System.out.print("- Input warranty: ");
        warranty = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("- Warranty: " + warranty);
    }

    @Override
    public void changeInfor() {

    }
}
