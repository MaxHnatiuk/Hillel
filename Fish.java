abstract class Fish {
    private String name;

    public Fish(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract String getType();
}