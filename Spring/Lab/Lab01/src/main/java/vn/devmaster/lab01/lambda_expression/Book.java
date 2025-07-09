package vn.devmaster.lab01.lambda_expression;

public class Book {
    int id;
    String name;
    float price;
    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book {" +
                "id = " + id +
                ", name = " + name +
                ", price=" + price +
                "}";
    }
}
