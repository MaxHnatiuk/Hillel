class Boat extends Watercraft implements PassengerWaterTransport{
    private int maxPassengers;
    private int currentPassengers;

    public Boat(String name, int length, int maxSpeed, int maxPassengers) {
        super(name, length, maxSpeed);
        this.maxPassengers = maxPassengers;
        this.currentPassengers = 0;
    }

    @Override
    public void move() {
        System.out.println("Boat is moving.");
    }

    @Override
    public void embarkPassengers(int numOfPassengers) {
        if (currentPassengers + numOfPassengers > maxPassengers) {
            System.out.println("Boat cannot embark all passengers.");
        } else {
            currentPassengers += numOfPassengers;
            System.out.println(numOfPassengers + " passengers have embarked on the boat.");
        }
    }

    @Override
    public void disembarkPassengers(int numOfPassengers) {
        if (currentPassengers - numOfPassengers < 0) {
            System.out.println("Boat cannot disembark more passengers than it currently has.");
        } else {
            currentPassengers -= numOfPassengers;
            System.out.println(numOfPassengers + " passengers have disembarked from the boat.");
        }
    }
}
