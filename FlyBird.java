public abstract class FlyBird {
    private String name;
    private int age;

    public FlyBird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void fly();

    public abstract void makeSound();
}
