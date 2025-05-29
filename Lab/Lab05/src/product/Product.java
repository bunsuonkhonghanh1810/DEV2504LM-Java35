package product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private double prodPrice;
    private String manufacturer;

    public Product(String prodId, String prodName, double prodPrice, String manufacturer) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.manufacturer = manufacturer;
    }

    public Product() {}

    public String getProdId() {
        return prodId;
    }
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public double getProdPrice() {
        return prodPrice;
    }
    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        prodId = sc.nextLine();
        System.out.print("Enter product name: ");
        prodName = sc.nextLine();
        System.out.print("Enter product price: ");
        prodPrice = sc.nextDouble();
        System.out.print("Enter product manufacturer: ");
        manufacturer = sc.nextLine();
    }

    public void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Product Price: " + prodPrice);
        System.out.println("Product Manufacturer: " + manufacturer);
    }

    public float calculateSalePrice() {
        return (float) (prodPrice + 0.05*prodPrice);
    }
}
