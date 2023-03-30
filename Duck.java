class Duck extends FlyingBird{
    private final String name;
    private final int age;

    public Duck(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Quack-quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}
