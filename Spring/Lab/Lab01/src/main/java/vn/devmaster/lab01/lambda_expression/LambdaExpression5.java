package vn.devmaster.lab01.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpression5 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Lập trình Java", 9.95f));
        books.add(new Book(2, "Java SpringBoot", 19.95f));
        books.add(new Book(3, "PHP Laveral", 12.95f));
        books.add(new Book(4, "NetCore API", 29.95f));
        books.add(new Book(5, "JavaScript", 19.95f));

        Stream<Book> filter = books.stream().filter(b -> b.price > 15f);

        filter.forEach(System.out::println);
    }
}
