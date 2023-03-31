public class Eagle extends FlyBird{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying high in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches loudly.");
    }
}
