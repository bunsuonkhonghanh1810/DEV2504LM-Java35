package baitaptulam3.country;

public class Country implements ICountry {
    private String countryName;
    double area;
    long numberPerson;

    public Country() {}

    public Country(String countrynNme, double area, long numberPerson) {
        this.countryName = countrynNme;
        this.area = area;
        this.numberPerson = numberPerson;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(long numberPerson) {
        this.numberPerson = numberPerson;
    }

    @Override
    public void input() {

    }

    @Override
    public void display() {

    }

    @Override
    public float averageArea(double area, long numberPerson) {
        return 0;
    }
}
