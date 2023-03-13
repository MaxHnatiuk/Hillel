package OOP;

public abstract class IsoscelesTriangle extends Figure {
    public IsoscelesTriangle(String name, double[] sides) {
        super(name, sides);
    }
    @Override
    public double getArea() {
        return (sides[1] / 4) * Math.sqrt((4 * sides[0] * sides[0]) - (sides[1] * sides[1]));
    }
}
