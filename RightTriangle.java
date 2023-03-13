package OOP;

public abstract class RightTriangle extends Figure {
    public RightTriangle(String name, double[] sides) {
        super(name, sides);
    }
    @Override
    public double getArea() {
        return ((sides[0] * sides[1]) / 2);
    }
}
