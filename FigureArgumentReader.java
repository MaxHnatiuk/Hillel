import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FigureArgumentReader {
    public Map<String, Double> readArguments(String figureType) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> arguments = new HashMap<>();

        switch (figureType) {
            case "triangle":
                System.out.print("Enter the first side of the triangle: ");
                double a = scanner.nextDouble();

                System.out.print("Enter the second side of the triangle: ");
                double b = scanner.nextDouble();

                System.out.print("Enter the third side of the triangle: ");
                double c = scanner.nextDouble();

                arguments.put("a", a);
                arguments.put("b", b);
                arguments.put("c", c);
                break;

            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                arguments.put("radius", radius);
                break;

            case "isosceles triangle":
                System.out.print("Enter the base of the isosceles triangle: ");
                double base = scanner.nextDouble();

                System.out.print("Enter the side of the isosceles triangle: ");
                double side = scanner.nextDouble();

                arguments.put("base", base);
                arguments.put("side", side);
                break;

            case "quadrilateral":
                System.out.print("Enter the first side of the quadrilateral: ");
                double side1 = scanner.nextDouble();

                System.out.print("Enter the second side of the quadrilateral: ");
                double side2 = scanner.nextDouble();

                System.out.print("Enter the third side of the quadrilateral: ");
                double side3 = scanner.nextDouble();

                System.out.print("Enter the fourth side of the quadrilateral: ");
                double side4 = scanner.nextDouble();

                arguments.put("side1", side1);
                arguments.put("side2", side2);
                arguments.put("side3", side3);
                arguments.put("side4", side4);
                break;

            default:
                return null;
        }

        return arguments;
    }
}
