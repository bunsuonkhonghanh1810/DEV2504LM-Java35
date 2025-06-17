public class Animal {
    protected String name;
    protected int legs;
    protected int age;

    public Animal(String name, int legs, int age) {
        this.name = name;
        this.legs = legs;
        this.age = age;
    }

    public Animal() {}

    void show() {
        System.out.println("Animal");
        System.out.println(this.name);
        System.out.println(this.legs);
    }
}
