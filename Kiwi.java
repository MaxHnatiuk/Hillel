class Kiwi extends Bird implements NonFlyingBird{
    private String name;
    private int age;

    public Kiwi(String name, int age) {
        super(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Kar-kar");
    }

    public void walk() {
        System.out.println("I walk slowly");
    }
}
