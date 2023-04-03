class Tractor extends Transport implements CargoTransport{
    private int cargoWeight;

    public Tractor(String name, String color, int weight) {
        super(name, color, weight);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void transportCargo(int weight) {
        System.out.println("The tractor carries a heavy load " + weight + " kg");
    }

    @Override
    public void move() {
        System.out.println("The tractor is driving across the field");
    }
}
