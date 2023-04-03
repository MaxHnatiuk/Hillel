class Bus extends Transport implements PassengerTransport{
    private int passengerCount;

    public Bus(String name, String color, int weight) {
        super(name, color, weight);
        this.passengerCount = passengerCount;
    }

    @Override
    public void transportPassengers(int count) {
        System.out.println("A bus carries " + count + " passengers");
    }

    @Override
    public void move() {
        System.out.println("A bus is driving on the road");
    }
}
