package Equation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getx1() {
        return getx1();
    }

    public double getx2() {
        return getx2();
    }

    public double getx() {
        return getx();
    }

    public void solve() {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Equation %.2fx^2 + %.2fx + %.2f = 0 has roots:%n", a, b, c);
            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Equation %.2fx^2 + %.2fx + %.2f = 0 has one root:%n", a, b, c);
            System.out.printf("x = %.2f%n", x);
        } else {
            System.out.printf("Equation %.2fx^2 + %.2fx + %.2f = 0 has no real roots.%n", a, b, c);
        }
    }
}
