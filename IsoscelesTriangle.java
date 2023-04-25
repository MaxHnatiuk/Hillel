import java.util.Scanner;

class IsoscelesTriangle extends Figure{
    public IsoscelesTriangle() {
        this.name = "IsoscelesTriangle";
    }

    public void readArguments(Scanner scanner) {
        System.out.println("Enter the length of the base and the side of the isosceles triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        scanner.nextLine();

        this.area = 0.5 * a * h;;
        this.perimeter = 0.5 * Math.sqrt(4 * h * h + a * a);
    }
}
