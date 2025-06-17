public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Horse", 4, 4);
        animal.show();

        Herbivore herbivore = new Herbivore("Goat", 4, 5);
        herbivore.show();
    }
}
