import java.util.Scanner;

class Circle extends Figure{
    public Circle() {
        this.name = "Circle";
    }

    @Override
    public void readArguments(Scanner scanner) {
        System.out.println("Enter the radius of the circle:");
        double r = scanner.nextDouble();
        scanner.nextLine();

        this.area = Math.PI * r * r;
        this.perimeter = 2 * Math.PI * r;
    }
}
