package OOP;

public abstract class Figure {
    protected double x;
    protected double y;
    protected double[] sides; //масив для зберігання довжин сторін
    protected String name;
    protected double[] coordinates;
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Figure(String name, double[] sides) {
        this.name = name;
        this.sides = sides;
    }
    public Figure(double[] coordinates) {
        this.coordinates = coordinates;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getName() {
        return name;
    }
    public double[] getSides() {
        return sides;
    }
}

