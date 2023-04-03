class Car extends Transport implements PassengerTransport{
    private int passengerCount;

    public Car(String name, String color, int weight) {
        super(name, color, weight);
        this.passengerCount = passengerCount;
    }

    @Override
    public void transportPassengers(int count) {
        System.out.println("A car carries " + count + " passengers");
    }

    @Override
    public void move() {
        System.out.println("A car is driving on the road");
    }
}
