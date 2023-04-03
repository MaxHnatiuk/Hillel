public class MainD {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Escort", 2000);
        Bus bus = new Bus("Mercedes-Benz", "Sprinter", 3500);
        Tractor tractor = new Tractor("Patriot", "Model S", 7000);

        car.move();
        car.transportPassengers(4);

        bus.move();
        bus.transportPassengers(18);

        tractor.move();
        tractor.transportCargo(7000);
    }
}
