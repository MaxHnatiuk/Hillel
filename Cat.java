class Cat extends Animal implements Movable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("The cat is running.");
    }
}
