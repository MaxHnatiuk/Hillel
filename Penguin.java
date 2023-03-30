class Penguin extends Bird implements NonFlyingBird {
    private String name;
    private int age;

    public Penguin(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("The sound of crunching snow");
    }

    public void walk() {
        System.out.println("I am walking");
    }
}
