package family;

public class Main {
    public static void main(String[] args) {
        Parent.sayHello();  // 👉 In ra: Hello from Parent
        Child.sayHello();   // 👉 In ra: Hello from Child

        Parent p = new Child();
        p.sayHello();       // 👉 In ra: Hello from Parent (vì static không đa hình)
    }

}
