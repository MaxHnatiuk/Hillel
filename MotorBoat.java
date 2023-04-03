class MotorBoat extends Boat{
    private int horsepower;
    public MotorBoat(String name, int length, int maxSpeed, int maxPassengers, int horsepower) {
        super(name, length, maxSpeed, maxPassengers);
        this.horsepower = horsepower;
    }

    public void accelerate() {
        System.out.println("Motorboat is accelerating with " + horsepower + " horsepower.");
    }
}
