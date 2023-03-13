package OOP;

public abstract class Quadrilateral extends Figure{
    public Quadrilateral(double[] coordinates) {
        super(coordinates);
    }
    public abstract double getPerimeter();
}
