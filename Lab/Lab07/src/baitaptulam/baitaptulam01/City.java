package baitaptulam.baitaptulam01;

import java.util.Scanner;

public class City {
    private String cityId;
    private String cityName;
    private String country;
    private double area;

    public City() {}

    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("City Id: ");
        cityId = sc.nextLine();
        System.out.print("City Name: ");
        cityName = sc.nextLine();
        System.out.print("Country: ");
        country = sc.nextLine();
        System.out.print("Area: ");
        area = sc.nextDouble();
        sc.close();
    }

    public void hienthi() {
        System.out.println("City Id: " + cityId);
        System.out.println("City Name: " + cityName);
        System.out.println("Country: " + country);
        System.out.println("Area: " + area);
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
