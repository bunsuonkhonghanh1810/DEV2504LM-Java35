public class Herbivore extends Animal {

    public Herbivore(String name, int legs, int age) {
        super(name, legs, age);
    }

    @Override
    void show() {
        System.out.println("Herbivore");
        System.out.println(this.name);
        System.out.println(this.legs);
    }
}
