import java.util.Scanner;

class Triangle extends Figure{
    public Triangle() {
        this.name = "Triangle";
    }

    @Override
    public void readArguments(Scanner scanner) {
        System.out.println("Enter the lengths of the sides of the triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.nextLine();

        double p = (a + b + c) / 2;
        this.area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        this.perimeter = a + b + c;
    }
}
