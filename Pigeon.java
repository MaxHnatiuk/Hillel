public class Pigeon extends FlyBird{
    public Pigeon(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " wings wide and flies at different heights.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " coos.");
    }
}
