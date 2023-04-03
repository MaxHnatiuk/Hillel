class Hamster extends Animal implements Movable{
    public Hamster(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("Peep");
    }

    @Override
    public void move() {
        System.out.println("A hamster runs in a wheel.");
    }
}
