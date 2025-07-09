package vn.devmaster.lab01.lambda_expression;

public class LambdaExpression2 {
    public static void main(String[] args) {
        SayHello2 sayHello1 = (name) -> {
            System.out.println("Hello " + name);
        };

        sayHello1.sayHello("Devmaster");

        SayHello2 sayHello2 = name -> {
            System.out.println("Hello " + name);
        };

        sayHello2.sayHello("Devmaster");

        SayHello2 sayHello3 = name -> System.out.println("Hello " + name);

        sayHello3.sayHello("Devmaster");
    }
}
