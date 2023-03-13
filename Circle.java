package OOP;

public abstract class Circle extends Figure {
    private double radius;
    public Circle(double x, double y) {
        super(x, y);
    }
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}