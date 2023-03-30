class Carp extends Fish implements Swimmable {
    public Carp(String name) {
        super(name);
    }

    public String getType() {
        return "carp";
    }

    public void swim() {
        System.out.println("The carp is swimming.");
    }
}
