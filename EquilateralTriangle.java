package OOP;

public abstract class EquilateralTriangle extends Figure {
    public EquilateralTriangle(String name, double[] sides) {
        super(name, sides);
    }
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * (sides[0] * sides[0]);
    }
}
