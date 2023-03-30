class Catfish extends Fish implements Swimmable{
    public Catfish(String name) {
        super(name);
    }

    public String getType() {
        return "catfish";
    }

    public void swim() {
        System.out.println("The catfish is swimming.");
    }
}
