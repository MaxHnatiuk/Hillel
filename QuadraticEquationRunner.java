package Equation;
import java.util.Scanner;

public class QuadraticEquationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients of quadratic equation:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.solve();
        System.out.println("Quadratic equation " + equation + " has roots:");
        if (Double.isNaN(equation.getx1()) && Double.isNaN(equation.getx2())) {
            System.out.println("No real roots");
        }

        else if (Double.isNaN(equation.getx2())) {
            System.out.println("x = " + equation.getx());
        }
        else {
            System.out.println("x1 = " + equation.getx1());
            System.out.println("x2 = " + equation.getx2());
        }
    }
}
