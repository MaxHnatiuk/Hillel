public class Aircraft extends FlyingMachine{
    private int wingspan;
    public Aircraft(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void fly() {
        System.out.println("The biplane is flying!");
    }
}
