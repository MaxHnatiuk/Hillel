public class MainE {
    public static void main(String[] args) {

        Watercraft watercraft = new Watercraft("Watercraft", 10, 20) {
            @Override
            public void move() {
                System.out.println("All floating vehicles move on water");
            }
        };

        System.out.println(watercraft);

        Boat boat = new Boat("Boat 1", 15, 25, 5);
        System.out.println(boat);
        boat.move();
        boat.embarkPassengers(4);
        boat.disembarkPassengers(2);

        Barge barge = new Barge("Barge 1", 30, 10, 20);
        System.out.println(barge);
        barge.move();
        barge.embarkPassengers(15);
        barge.disembarkPassengers(10);

        MotorBoat motorboat = new MotorBoat("Motorboat 1", 10, 30, 3, 200);
        System.out.println(motorboat);
        motorboat.move();
        motorboat.embarkPassengers(2);
        motorboat.accelerate();
    }
}
