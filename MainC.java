public class MainC {
    public static void main(String[] args) {
        FlyBird eagle = new Eagle("Taras", 5);
        FlyBird stork = new Stork("Andriy", 3);
        FlyBird pigeon = new Pigeon("Valeriy", 1);

        eagle.fly();
        eagle.makeSound();

        stork.fly();
        stork.makeSound();

        pigeon.fly();
        pigeon.makeSound();
    }
}
