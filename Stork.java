public class Stork extends FlyBird{
    public Stork(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " clacks its bill.");
    }
}
