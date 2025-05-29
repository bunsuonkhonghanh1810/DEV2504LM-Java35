package vietnam;

import product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;

    public VietNamImportPrice(String prodId, String prodName, double prodPrice, String manufacturer, float taxImported) {
        super(prodId, prodName, prodPrice, manufacturer);
        this.taxImported = taxImported;
    }

    public VietNamImportPrice() {}

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter import tax: ");
        taxImported = sc.nextFloat();
        sc.close();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tax Imported: " + taxImported);
    }
}