package devmaster.demonested;

public class DemoNested {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        Nested nested = new Nested();
        System.out.println("Address: " + nested.Address);
    }

    class Nested {
        String Address;
    }
}
