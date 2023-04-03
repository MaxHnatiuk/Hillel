public class MainB {
    public static void main(String[] args) {
        Animal cat = new Cat("Lion", 8);
        Animal dog = new Dog("Archibald", 5);
        Animal hamster = new Hamster("Anton", 1);

        cat.makeSound();
        dog.makeSound();
        hamster.makeSound();

        if (cat instanceof Movable) {
            Movable movableCat = (Movable) cat;
            movableCat.move();
        }

        if (dog instanceof Movable) {
            Movable movableDog = (Movable) dog;
            movableDog.move();
        }
        if (hamster instanceof Movable) {
            Movable movableHamster = (Movable) hamster;
            movableHamster.move();
        }
    }
}
