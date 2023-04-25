import java.util.Scanner;

class Square extends Figure{
    public Square() {
        this.name = "Square";
    }

    public void readArguments(Scanner scanner) {
        System.out.println("Enter the length of the side of the square:");
        double a = scanner.nextDouble();
        scanner.nextLine();

        this.area = a * a;;
        this.perimeter = 4 * a;
    }
}
