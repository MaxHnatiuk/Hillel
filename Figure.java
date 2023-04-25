import java.util.Scanner;

abstract class Figure implements Comparable<Figure>{
    protected String name;
    protected double area;
    protected double perimeter;

    public abstract void readArguments(Scanner scanner);

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public int compareTo(Figure other) {
        if (this.area < other.area) {
            return -1;
        }
        else if (this.area > other.area) {
            return 1;
        }
        else {
            return Double.compare(this.perimeter, other.perimeter);
        }
    }
}
