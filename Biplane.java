public class Biplane extends FlyingMachine implements Winged{
    private int wingspan;

    public Biplane(String name, int maxSpeed, int wingspan) {
        super(name, maxSpeed);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    @Override
    public void fly() {
        System.out.println("The biplane is flying!");
    }

    @Override
    public void flapWings() {
        System.out.println("The biplane is flapping its wings!");
    }
}
