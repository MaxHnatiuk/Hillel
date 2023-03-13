package java;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
    Scanner num = new Scanner(System.in);
    float first, second, third, result, x; // Де x це зарплата без податків
    System.out.println("Number of hours per week: ");
    first = num.nextInt();
    System.out.println("Annual salary with taxes: ");
    second = num.nextInt();
    System.out.println("Tax percentage: ");
    third = num.nextInt();
    result = ((second / (1 - (third / 100)) / (first * 48))) ; // Формула для визначення вартості однієї години часу
    System.out.println("an hour of work is worth: " + result);
    }
}
