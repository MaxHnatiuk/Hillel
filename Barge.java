class Barge extends Watercraft implements PassengerWaterTransport {
    private int maxPassengers;
    private int currentPassengers;

    public Barge(String name, int length, int maxSpeed, int maxPassengers) {
        super(name, length, maxSpeed);
        this.maxPassengers = maxPassengers;
        this.currentPassengers = 0;

    }

    @Override
    public void move() {
        System.out.println("Barge is moving.");
    }

    @Override
    public void embarkPassengers(int numOfPassengers) {
        if (currentPassengers + numOfPassengers > maxPassengers) {
            System.out.println("Barge cannot embark all passengers.");
        } else {
            currentPassengers += numOfPassengers;
            System.out.println(numOfPassengers + " passengers have embarked on the barge.");
        }
    }

    @Override
    public void disembarkPassengers(int numOfPassengers) {
        if (currentPassengers - numOfPassengers < 0)
        {
            System.out.println("Barge cannot disembark more passengers than it currently has.");
        }
        else
        {
            currentPassengers -= numOfPassengers;
            System.out.println(numOfPassengers + " passengers have disembarked from the barge.");
        }
    }
}