class Pike extends Fish implements Swimmable{
    public Pike(String name) {
        super(name);
    }
    public String getType() {
        return "pike";
    }
    public void swim() {
        System.out.println("The pike is swimming.");
    }
}