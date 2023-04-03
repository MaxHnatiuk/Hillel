public class Baloon extends FlyingMachine{
    private int gasVolume;

    public Baloon(String name, int maxSpeed, int gasVolume) {
        super(name, maxSpeed);
        this.gasVolume = gasVolume;
    }

    public int getGasVolume() {
        return gasVolume;
    }

    @Override
    public void fly() {
        System.out.println("The balloon is flying!");
    }
}
