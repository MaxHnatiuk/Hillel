import java.util.Scanner;

public class Homework_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("no")) {
            System.out.println("Which shape would you like to draw? (rectangle, right triangle," +
                    " left triangle, equilateral triangle)");
            userInput = scanner.nextLine();

            if (userInput.equals("rectangle")) {
                System.out.println("Please enter the height:");
                int height = scanner.nextInt();
                System.out.println("Please enter the width:");
                int width = scanner.nextInt();
                drawRectangle(height, width);
            } else if (userInput.equals("right triangle")) {
                System.out.println("Please enter the height:");
                int height = scanner.nextInt();
                drawRightTriangle(height);
            } else if (userInput.equals("left triangle")) {
                System.out.println("Please enter the height:");
                int height = scanner.nextInt();
                drawInvertedRightTriangle(height);
            } else if (userInput.equals("equilateral triangle")) {
                System.out.println("Please enter the height:");
                int height = scanner.nextInt();
                drawEquilateralTriangle(height);
            } else {
                System.out.println("Invalid input, please try again.");
            }
            scanner.nextLine();

            System.out.println("Would you like to draw another shape? (yes or no)");
            userInput = scanner.nextLine().toLowerCase();
        }
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawRightTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j < height - (1 + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void drawInvertedRightTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawEquilateralTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
