package java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second;
        System.out.println("The first number: ");
        first = num.nextInt();
        System.out.println("The second number: ");
        second = num.nextInt();
        System.out.print((int)Math.pow(first, second)); // За допомогою методу Math.pow знаходимо шукане число
    }
}