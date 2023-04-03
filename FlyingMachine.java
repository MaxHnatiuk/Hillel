public abstract class FlyingMachine {

    protected String name;
    protected int maxSpeed;

    public FlyingMachine(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }


    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void fly();
}

