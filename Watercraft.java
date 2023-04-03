abstract class Watercraft {
    protected String name;
    protected int length;
    protected int maxSpeed;

    public Watercraft(String name, int length, int maxSpeed) {
        this.name = name;
        this.length = length;
        this.maxSpeed = maxSpeed;
    }

    public abstract void move();
}
