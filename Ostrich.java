class Ostrich extends Bird implements NonFlyingBird{
    private String name;
    private int age;

    public Ostrich(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Scream");
    }

    public void walk() {
        System.out.println("I run very fast");
    }
}
